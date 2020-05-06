		package ejercicioMenuFacturas;
		import java.util.Scanner;
		import java.io.FileWriter;
		import java.io.FileReader;
		import java.io.BufferedWriter;
		import java.io.BufferedReader;
		import java.text.DecimalFormat;
		import java.io.IOException;
		public class EjercicioMenuFacturas {
			static final String ruta = "C:\\Users\\dyang\\eclipse-workspace\\ArchivosDatos\\articulos.txt";
			static int Menu(Scanner e) {
				int op = 0;
				System.out.println("\n\tMENU\n\t====\n");
				System.out.println("1.- Altas. ");
				System.out.println("2.- Factura.");
				System.out.println("3.- Fin.");
				do {
					System.out.println("Teclear opción (1-3)? ");
					op = e.nextInt();
				}while (op <1 || op >3);
				return op;
			}
			static void altas (Scanner e) {
				String codigo = null, denominacion = null, precio = null, unidVend = null;
				float prec = 0;
				int unVe = 0;
				char tipo = ' ';
				e.nextLine();
				try {
					BufferedWriter esc = new BufferedWriter (new FileWriter (ruta+"articulos.txt",false));
					System.out.println("\n\tALTAS\n\t=====\n");
					do {
						System.out.println("Código (max. 6 caracteres) (\"*\" para fin? ");
						codigo = e.nextLine();
					}while(codigo.length()>6);
					while(!codigo.contentEquals("*")) {
						do {
							System.out.println("Denominación (max. 15 caracteres");
							denominacion = e.nextLine();
						}while(denominacion.length()>15);
						do {
							System.out.println("Precio? ");
							precio = e.next();
							try {
								prec = Float.parseFloat(precio);
								
							}catch(NumberFormatException nfe) {
								prec = Float.MAX_VALUE;
							}
						}while (prec == Float.MAX_VALUE);
						try {
							do {
								System.out.println("Tipo (A/B/C)? ");
								tipo = Character.toUpperCase((char) System.in.read());
								while(System.in.read()!='\n');
							}while(tipo!='A' && tipo!='B'&& tipo != 'C');
						}catch(IOException ioe) {}
						do {
							System.out.println("Unidades Vendidas? ");
							unidVend = e.next();
							try {
								unVe= Integer.parseInt(unidVend);
							}catch(NumberFormatException nfe) {
								unVe = Integer.MAX_VALUE;
							}
						}while(unVe == Integer.MAX_VALUE);
						esc.write(codigo);
						esc.newLine();
						esc.write(denominacion);
						esc.newLine();
						esc.write(precio);
						esc.newLine();
						esc.write(tipo);
						esc.newLine();
						esc.write(unidVend);
						esc.newLine();
						e.nextLine();
						do {
							System.out.println("Código (Máx. 6 caracteres) (\"*\" para salir");
							codigo = e.nextLine();
						}while (codigo.length()>6);
					}
					esc.close();
				}catch (IOException ioe) {}
			}
			static float calculoIva(float p, char t) {
				float iva = 0;
				switch(t) {
				case 'A':
					iva = (float) 0.21;
					break;
				case 'B':
					iva = (float) 0.10;
					break;
					default:
						iva = (float) 0.04;
				}
				return p*iva;
			}
			static void factura () {
				DecimalFormat numero = new DecimalFormat("######.##");
				String codigo = null, denominacion = null;
				float precio = 0, impIva = 0, precioB = 0;
				char tipo = ' ';
				int uniVend = 0;
				try {
					BufferedReader lec = new BufferedReader(new FileReader (ruta+"articulos.txt"));
					System.out.println("\n\t\t\t\t\tFactura\n\t\t\t\t\t-----------");
					System.out.println("Código\tDenominación\t\tPrec Uni.\tUnid. Vend.\tTipo\tPrecio\t\tIVA\tPrecio + IVA");
					System.out.println("-----------------------------------------------------------------------------------------------------------------------");
					codigo = lec.readLine();
					while (codigo!= null) {
						denominacion = lec.readLine();
						precio = Float.parseFloat(lec.readLine());
						tipo = lec.readLine().charAt(0);
						uniVend = Integer.parseInt(lec.readLine());
						impIva = calculoIva(precio, tipo);
						precioB = precio*uniVend;
						System.out.print(codigo+"\t"+denominacion+tabular(denominacion));
						System.out.print(numero.format(precio)+"\t\t\t"+numero.format(uniVend)+"\t"+tipo+"\t");
						System.out.println(numero.format(precioB)+"\t\t"+numero.format(impIva)+"\t"+"\t"+numero.format(precioB+impIva));
						codigo = lec.readLine();
					}
					lec.close();
				}catch (IOException ioe) {}
			}
			static String tabular(String cad) {
				String t = "\t\t";
				if (cad.length()<8)
					t = "\t\t\t";
				return t;
			}
			static void fin() {
				System.out.println("\n\n\n\tFIN DEL PROGRAMA\n\t================\n");
			}
			public static void main (String[] args) {
				Scanner entrada = new Scanner (System.in);
				int opcion = 0;
				do {
					opcion = Menu(entrada);
					switch(opcion) {
					case 1:
						altas(entrada);
						break;
					case 2:
						factura();
						break;
						default:
							fin();
					}
				}while(opcion != 3);
				entrada.close();
			}
		}