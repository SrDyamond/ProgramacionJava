package claseLibro;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String genero;
	private float precio;
	
	Libro() {
		this.isbn="";
		this.titulo="";
		this.autor=" ";
		this.genero=" ";
		this.precio=0;
	}
	
	Libro(String i, String t, String a, String g, float p) { //constructor llenado con libros en
		// el metodo llenar array
		this.isbn=i;
		this.titulo=t;
		this.autor=a;
		this.genero=g;
		this.precio=p;
	}

	public String infoTabulada() {
				return "-" + 
				this.isbn + "||"+
				this.titulo + "-" +
				this.autor + "-" +
				this.genero + "-" +
				this.precio + "";
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}	
	
}
