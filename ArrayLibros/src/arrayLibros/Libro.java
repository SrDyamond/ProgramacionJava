package arrayLibros;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String genero;
	private double precio;
	Libro (String isbn, String titulo, String autor, String genero, double precio){
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor= autor;
		this.genero = genero;
		this.precio = precio;
	}
	Libro(){}
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
