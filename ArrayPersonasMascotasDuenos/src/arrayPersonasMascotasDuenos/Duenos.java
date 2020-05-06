package arrayPersonasMascotasDuenos;

public class Duenos {
	private String dni;
	private String nombreP;
	private String nombreM;
	int edad;
	Duenos(String dni,String nombreP,String nombreM,int edad){
		this.dni = dni;
		this.nombreP = nombreP;
		this.nombreM = nombreM;
		this.edad = edad;
	}
	Duenos(){}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getNombreM() {
		return nombreM;
	}
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
