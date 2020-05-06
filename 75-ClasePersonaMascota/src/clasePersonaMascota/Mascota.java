package clasePersonaMascota;

public class Mascota {
	private String dni;
	private int edad;
	private String nombre;
	
	Mascota(){
		this.dni="";
		this.edad=0;
		this.nombre="";
		
	}
	Mascota(String _dni,int _edad,String _nombre){
		this.dni=_dni;
		this.edad=_edad;
		this.nombre=_nombre;
	}

	public String visualizar() {
		return this.dni+"\t"+this.edad+"\t"+this.nombre;
	}
	
	
	
	
	
	
	
	//////////////GETSET/////////////////
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
