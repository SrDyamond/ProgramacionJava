package sanchezRodriguezDyango_Examen2;

public class Coche {
	//atributos
	private String matricula;
	private String marca;
	private String modelo;
	private String gama;
	private double precio;
	
	// constructores
		Coche(String matricula, String marca, String modelo, String gama,double precio) {
			this.matricula = matricula;
			this.marca = marca;
			this.modelo = modelo;
			this.gama = gama;
			this.precio = precio;
		}

		public String pasarString() {
			return this.matricula + " " + this.marca + " " + this.modelo + " " + this.gama + " " + this.precio;
		}

		//getters ands setters
		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getGama() {
			return gama;
		}

		public void setGama(String gama) {
			this.gama = gama;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		
}
