package clasePersonaMascota;

public class DueñosMascotas {
		private String dni;
		private String nombreD;
		private String nombreM;
		private int edadM;
		
		///////Constructores
	 DueñosMascotas(){
			this.dni="";
			this.nombreD="";
			this.nombreM="";
			this.edadM=0;
		}
		DueñosMascotas(String dni,String nombreD,String nombreM,int edadM) {
			this.dni=dni;
			this.nombreD=nombreD;
			this.nombreM=nombreM;
			this.edadM=edadM;
		}
		
		////////Metodos
		public String visualizar() {
			return this.dni+"\t"+this.nombreD+"\t"+this.nombreM+"\t"+this.edadM+"\t";
		}
		
		////////GETSET
		public String getDni() {
			return dni;
		}
		public String getNombreD() {
			return nombreD;
		}
		public String getnombreM() {
			return nombreM;
		}
		public int getEdadM() {
			return edadM;
		}
		public void setDni(String dni) {
			this.dni=dni;
		}
		public void setNombreD(String nombreD) {
			this.nombreD=nombreD;
		}
		public void setNombreM(String nombreM) {
			this.nombreM=nombreM;
		}
		public void setEdadM(int edadM) {
			this.edadM=edadM;
		}
		
		
		
	}
