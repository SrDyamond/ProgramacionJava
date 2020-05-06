package arrayPersonasMascotasDuenos;

public class Personas {
	private String dni;
	private String nombre;
	Personas (String dni,String nombre){
		this.dni = dni;
		this.nombre = nombre;
	}
	Personas(){}
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
}
