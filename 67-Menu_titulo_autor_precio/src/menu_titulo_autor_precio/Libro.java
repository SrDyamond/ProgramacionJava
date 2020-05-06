package menu_titulo_autor_precio;

public class Libro {
	
	private String titulo;
	private String autor;
	private float precio;
	
	Libro() {
		this.titulo = "";
		this.autor = "";
		this.precio = 0;
	}
	
	Libro(String _t, String _a, float _p) {
		this.titulo = _t;
		this.autor = _a;
		this.precio = _p;
	}
	
	Libro(String _fileLine) {
		String part[] = _fileLine.split("#");
		this.titulo = part[0];
		this.autor = part[1];
		this.precio = Float.parseFloat(part[2]);
	}
	
	// -------------------------------------------------------------------------
	
	public void setTitulo(String _t) {this.titulo = _t;}
	public void setAutor(String _a) {this.autor = _a;}
	public void setPrecio(float _p) {this.precio = _p;}
	
	public String getTitulo() {return this.titulo;}
	public String getAutor() {return this.autor;}
	public Float getPrecio() {return this.precio;}
	
	// -------------------------------------------------------------------------
	
	public String toString() {
		return "" + 
				this.titulo + "\t" +
				this.autor + "\t" +
				this.precio + "";
	}
	
	public String toStringForFile() {
		return "" + 
				this.titulo + "#" +
				this.autor + "#" +
				this.precio + "";
	}

}

