package mantLibros;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MantLibros {

    public static final int nMaxOpt = 5;
    public static final String dir = "/opt/jarchivos/";
    public static final String filename = "libros.dat";
    
    // --- UTILIDADES ----------------------------------------------------------
    public static String tabular(String in, int longitud) {
        String out = "";
        int i = 0;
        for (i = 0; i < longitud; i++) {
            if (i < in.length()) out += in.charAt(i);
                else out += ' ';
        }
        return out;
    }
    
    public static String tabular(int in, int longitud) {
        String out = "";
        String in_str = Integer.toString(in);
        int i = 0;
        for (i = 0; i < longitud; i++) {
            if (i < in_str.length()) out += in_str.charAt(i);
            else out += ' ';
        }
        return out;
    }
    
    public static String tabular(float in, int longitud) {
        String out = "";
        String in_str = Float.toString(in);
        int i = 0;
        for (i = 0; i < longitud; i++) {
            if (i < in_str.length()) out += in_str.charAt(i);
            else out += ' ';
        }
        return out;
    }
    
    public static String generarLineaTabulada(Libro l) {
        return  tabular(l.getNumero() * Libro.LONGITUD, 4) + " " +
                tabular(l.getNumero(), 4) + " " +
                tabular(l.getIsbn(), 13) + " " +
                tabular(l.getTitulo(), 25) + " " +
                tabular(l.getAutor(), 25) + " " +
                tabular(l.getEdicion(), 4) + " " +
                tabular(l.getPrecio(), 8);
    }
    
    // --- INTERFAZ DE USUARIO -------------------------------------------------
    public static void printMenu() {
        System.out.println();
        System.out.println("# --- MENU ---");
        System.out.println(" 1 - Altas");
        System.out.println(" 2 - Bajas");
        System.out.println(" 3 - Modificaciones");
        System.out.println(" 4 - Listados");
        System.out.println();
        System.out.println(" " + nMaxOpt + " - Fin");
        System.out.println();
    }
    
    public static int readOpt(Scanner s, int max) {
        int out = 0;
        do {
            System.out.print("Teclee opción (1-" + max + "): ");
            out = s.nextInt();
            s.nextLine();
        } while (out < 1 || out > max);
        return out;
    }
    
    // --- ALTAS ---------------------------------------------------------------
    public static String readStringLimit(Scanner s, String msg, int limite) {
        String out = "";
        do {
            System.out.print(msg + " (" + limite + " char max): ");
            out = s.nextLine();
        } while(out.length() > limite);
        return out;
    }
    
    public static String readStringLimitStrict(Scanner s, String msg, int limite) {
        String out = "";
        do {
            System.out.print(msg + " (" + limite + " char justos): ");
            out = s.nextLine();
        } while(out.length() != limite);
        return out;
    }
    
    public static int readInt(Scanner s, String msg) {
        String in_str = "";
        int in = 0;
        boolean isInt = false;
        do {
            System.out.print(msg + " (int): ");
            in_str = s.nextLine();
            try {
                in = Integer.parseInt(in_str);
                isInt = true;
            } catch (NumberFormatException nfe) {
                System.out.println("# ERROR: No es un Integer.");
            }
        } while (!isInt);
        return in;
    }
    
    public static float readFloat(Scanner s, String msg) {
        String in_str = "";
        float in = 0;
        boolean isDouble = false;
        do {
            System.out.print(msg + " (float): ");
            in_str = s.nextLine();
            try {
                in = Float.parseFloat(in_str);
                isDouble = true;
            } catch (NumberFormatException nfe) {
                System.out.println("# ERROR: No es un Float.");
            }
        } while (!isDouble);
        return in;
    }
    
    public static double readDouble(Scanner s, String msg) {
        String in_str = "";
        double in = 0;
        boolean isDouble = false;
        do {
            System.out.print(msg + " (double): ");
            in_str = s.nextLine();
            try {
                in = Double.parseDouble(in_str);
                isDouble = true;
            } catch (NumberFormatException nfe) {
                System.out.println("# ERROR: No es un Double.");
            }
        } while (!isDouble);
        return in;
    }
    
    public static char readSN(Scanner s, String msg) {
        char in = ' ';
        do {
            System.out.print(msg + " (S/N): ");
            in = s.nextLine().toUpperCase().charAt(0);
        } while (in != 'S' && in != 'N');
        return in;
    }

    public static void altas(Scanner s, String fullDir) {
        Libro libroTemporal = new Libro();
        int posicionDada = 0;
        
        char confirmar = 'S'; // no ahy motivo, es por definir algo
        char continuar = 'S'; // para que funcione el contnue
        
        int numero = 0;
        String isbn = "";
        String titulo = "";
        String autor = "";
        int edicion = 0;
        float precio = 0;
        
        System.out.println("\n# --- ALTAS ---");
        
        try {
            //TRUE para que no sobreescriba
            RandomAccessFile f = new RandomAccessFile(fullDir, "rw");
            do {
                
                numero = readInt(s, "Introduce el número del libro");

                posicionDada = numero * Libro.LONGITUD;
                f.seek(posicionDada);
                libroTemporal.leerDeArchivo(f);
                
                // comprobamos si la posición dada está llena o no
                if(libroTemporal.getNumero() != 0 && posicionDada < f.length()) {
                    System.out.println("# ERROR: Este código ya está lleno en el archivo.");
                    continue;
                } else {
                    isbn = readStringLimitStrict(s, "Introduce el ISBN", 13);
                    titulo = readStringLimit(s, "Introduce el título", 25);
                    autor = readStringLimit(s, "Introduce el autor", 25);
                    edicion = readInt(s, "Introduce el número de la edición");
                    precio = readFloat(s, "Introduce el precio");
                    
                    Libro l = new Libro(numero, isbn, titulo, autor, edicion, precio);
                    
                    System.out.println("# Se va a guardar el siguiente libro:");
                    System.out.println("# " + generarLineaTabulada(l));
                    do {
                        confirmar = readSN(s, "Desea guardar este libro?");
                    } while (confirmar != 'S' && confirmar != 'N');
                    
                    if (confirmar == 'S') {
                        // Si la nueva posición a guardar es mayor a la ultima del archivo, me posiciono al final
                        if (posicionDada > f.length())
                            f.seek(f.length());
                        
                        // Escribo personas vacías hasta llegar a la posición en la que voy a guardar mi nueva libro
                        while (posicionDada > f.length()) {
                            // Libro lvacio = new Libro();
                            // lvacio.guardarEnArchivo(f);
                            (new Libro()).guardarEnArchivo(f);
                        }
                        
                        // me situo en la nueva posición (donde voy a guardar)
                        f.seek(posicionDada);
                        
                        // guardamos el libro en su posición correspondiente
                        l.guardarEnArchivo(f);
                    }
                }
                
                do {
                    continuar = readSN(s, "Desea continuar introduciendo altas?");
                } while (continuar != 'S' && continuar != 'N');
                
            } while (continuar == 'S');
            f.close();
        } catch(IOException ioe) {
            // ioe.printStackTrace();
            System.out.println("# ERROR: Fallo al acceder al archivo.");
        }
        System.out.println("\n# ARCHIVO GUARDADO");
    }
    
    // --- LISTADO -------------------------------------------------------------
    public static void listar(String fullDir) {
        
        boolean finArchivo = false;
        Libro libroCambiante = new Libro();
        
        System.out.println("\n# --- LISTADO ---");
        
        try {
            RandomAccessFile f = new RandomAccessFile(fullDir, "r");
            finArchivo = libroCambiante.leerDeArchivo(f);
            while (!finArchivo) {
                System.out.println(generarLineaTabulada(libroCambiante));
                finArchivo = libroCambiante.leerDeArchivo(f);
            }
            f.close();
        } catch(IOException ioe) {
            System.out.println("# ERROR: Lectura fallida.");
        }
    }
    
    // --- BAJAS ---------------------------------------------------------------
//    public static void bajas(Scanner s, String fullDir) {
//        char confirmar = 'S'; // no ahy motivo, es por definir algo
//        char continuar = 'S'; // para que funcione el contnue
//        
//        int numero = 0;
//        String isbn = "";
//        String titulo = "";
//        String autor = "";
//        int edicion = 0;
//        float precio = 0;
//        
//        System.out.println("\n# --- BAJAS ---");
//        
//        try {
//            //TRUE para que no sobreescriba
//            RandomAccessFile f = new RandomAccessFile(fullDir, "rw");
//            do {
//                numero = readInt(s, "Introduce el número del libro");
//                isbn = readStringLimitStrict(s, "Introduce el ISBN", 13);
//                titulo = readStringLimit(s, "Introduce el título", 25);
//                autor = readStringLimit(s, "Introduce el autor", 25);
//                edicion = readInt(s, "Introduce el número de la edición");
//                precio = readFloat(s, "Introduce el precio");
//                
//                Libro l = new Libro(numero, isbn, titulo, autor, edicion, precio);
//                
//                System.out.println("# Se va a guardar el siguiente libro:");
//                System.out.println("# " + generarLineaTabulada(l));
//                do {
//                    confirmar = readSN(s, "Desea guardar este libro?");
//                } while (confirmar != 'S' && confirmar != 'N');
//                
//                if (confirmar == 'S') l.guardarEnArchivo(f);
//                
//                do {
//                    continuar = readSN(s, "Desea continuar introduciendo altas?");
//                } while (continuar != 'S' && continuar != 'N');
//                
//            } while (continuar == 'S');
//            f.close();
//        } catch(IOException ioe) {
//            // ioe.printStackTrace();
//            System.out.println("# ERROR: Fallo al acceder al archivo.");
//        }
//        System.out.println("\n# ARCHIVO GUARDADO");
//    }
    
    // --- MAIN ----------------------------------------------------------------
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opt = 0;
        
        do {
            printMenu();
            opt = readOpt(s, nMaxOpt);
            if (opt != nMaxOpt) {
                switch (opt) {
                    case 1:
                        altas(s, dir + filename);
                        break;
                    case 2:
                        // bajas(dir + filename);
                        break;
                    case 3:
                        // modificar(dir + filename);
                        break;
                    case 4:
                        listar(dir + filename);
                        break;
                }
            }
        } while (opt != nMaxOpt);
        
        System.out.println("¡FINAL DEL PROGRAMA!");
        s.close();
    }
    
}
