package mantLibrosTrabajoJava;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Libro {
	 private static final int PREF = 2; // PREFIJO_STRING (UTF)
	    private static final int LONG_INT = 4;
	    private static final int LONG_FLOAT = 4;
	    
	    private static final int LONG_ISBN = 13;
	    private static final int LONG_TITULO = 25;
	    private static final int LONG_AUTOR = 25;
	    
	    public static final int LONGITUD = LONG_INT + PREF + LONG_ISBN + PREF + LONG_TITULO + PREF + LONG_AUTOR + LONG_INT + LONG_FLOAT;
	  
	    
	    private int numero;
	    private String isbn; // 13
	    private String titulo; // 25
	    private String autor; // 25
	    private int edicion;
	    private float precio;
	    
	    Libro() {
	        this.numero = 0;
	        this.isbn = "ISBN VACIO";
	        this.titulo = "TITULO VACIO";
	        this.autor = "AUTOR VACIO";
	        this.edicion = 0;
	        this.precio = 0;
	    }
	    
	    Libro(int numero, String isbn, String titulo, String autor, int edicion, float precio) {
	        this.numero = numero;
	        this.isbn = isbn;
	        this.titulo = titulo;
	        this.autor = autor;
	        this.edicion = edicion;
	        this.precio = precio;
	    }
	    
	    public int getNumero() {
	        return numero;
	    }

	    public void setNumero(int numero) {
	        this.numero = numero;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(String isbn) {
	        this.isbn = isbn;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public int getEdicion() {
	        return edicion;
	    }

	    public void setEdicion(int edicion) {
	        this.edicion = edicion;
	    }

	    public float getPrecio() {
	        return precio;
	    }

	    public void setPrecio(float precio) {
	        this.precio = precio;
	    }
	    
	    
	    public String espacios(String in, int longitud) {
	        String out = "";
	        int i = 0;
	        for (i = 0; i < longitud; i++) {
	            if (i < in.length()) out += in.charAt(i);
	                else out += ' ';
	        }
	        return out;
	    }
	    
	    public void escribirArchivo(RandomAccessFile f) {        
	        try {
	            f.writeInt(this.numero);
	            f.writeUTF(this.espacios(this.isbn, LONG_ISBN));
	            f.writeUTF(this.espacios(this.titulo, LONG_TITULO));
	            f.writeUTF(this.espacios(this.autor, LONG_AUTOR));
	            f.writeInt(this.edicion);
	            f.writeFloat(this.precio);
	        } catch(IOException ioe) {
	            System.out.println("# ERROR: Fallo o gardar no archivo de texto.");
	        }
	    }
	    
	    public boolean leerDeArchivo(RandomAccessFile f) {
	        boolean finArchivo = false;
	        
	        try {
	            this.numero = f.readInt();
	            this.isbn = f.readUTF();
	            this.titulo = f.readUTF();
	            this.autor = f.readUTF();
	            this.edicion = f.readInt();
	            this.precio = f.readFloat();
	        } catch(EOFException eofe) {
	            finArchivo = true;
	        } catch(IOException ioe) {
	            System.out.println("# ERROR: Fallo o leer o archivo de texto.");
	        }
	        
	        return finArchivo;
	    }

	}
