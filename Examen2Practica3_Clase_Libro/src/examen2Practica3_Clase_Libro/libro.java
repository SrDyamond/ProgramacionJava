package examen2Practica3_Clase_Libro;

public class libro {
	//ATRIBUTOS
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private float precio;
	//CONSTRUCTORES
	libro(){
		isbn="";
		titulo="";
		autor="";
		editorial="";
		precio=0;
	}
	
	libro(String isbn,String titulo,String autor,String editorial,float precio){
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.precio=precio;
	}
	
	public String toString() {
		return this.isbn+" "+this.titulo+" "+this.autor+" "+this.editorial+" "+this.precio;
	}
	//GET

	public String getIsbn() {
		return isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public float getPrecio() {
		return precio;
	}
	
	//SET
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setEditorial(String editorial) {
		this.editorial=editorial;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
		
}
