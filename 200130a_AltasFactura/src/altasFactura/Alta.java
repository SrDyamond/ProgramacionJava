package altasFactura;

public class Alta {
	
	private String codigo;
	private String denominacion;
	private float precio_ud;
	private int ud_vendidas;
	private char tipo;
	
	Alta (String _cod, String _denom, float _pUd, int _udV, char _tipo) {
		this.codigo = _cod;
		this.denominacion = _denom;
		this.precio_ud = _pUd;
		this.ud_vendidas = _udV;
		this.tipo = _tipo;
	}
	
	Alta (String _linea_from_file) {
		String part[] = _linea_from_file.split("::");
		this.codigo = part[0];
		this.denominacion = part[1];
		this.precio_ud = Float.parseFloat(part[2]);
		this.ud_vendidas = Integer.parseInt(part[3]);
		this.tipo = part[4].charAt(0);
	}
	
	Alta () {
		this.codigo = "000000";
		this.denominacion = "nada";
		this.precio_ud = 0;
		this.ud_vendidas = 0;
		this.tipo = 'A';
	}
	
	public void setCodigo(String _codigo) {this.codigo = _codigo;}
	public void setDenominacion(String _denominacion) {this.denominacion = _denominacion;}
	public void setPrecioUd(float _precio_ud) {this.precio_ud = _precio_ud;}
	public void setUdVendidas(int _ud_vendidas) {this.ud_vendidas = _ud_vendidas;}
	public void setTipo(char _tipo) {this.tipo = _tipo;}
	
	public String getCodigo() {return this.codigo;}
	public String getDenominacion() {return this.denominacion;}
	public float getPrecioUd() {return this.precio_ud;}
	public int getUdVendidas() {return this.ud_vendidas;}
	public char getTipo() {return this.tipo;}
	
	// --- OTROS METODOS -------------------------------------------------------
	
	public float getPrecioFactura() {
		return this.precio_ud * this.ud_vendidas;
	}
	
	public float getIVAFromTipo() {
		float out = 0;
		switch (this.tipo) {
			case 'A':
				out = (float) 1.21;
			case 'B':
				out = (float) 1.10;
			case 'C':
				out = (float) 1.04;
		}
		return out;
	}
	
	public float getPrecioMasIVA() {
		return this.getPrecioFactura() * this.getIVAFromTipo();
	}
	
	public String toString() {
		return "" + 
				this.codigo + ", " +
				this.denominacion + ", " + 
				this.precio_ud + ", " + 
				this.ud_vendidas + ", " +
				this.tipo + ", " +
				this.getPrecioFactura() + ", " +
				this.getPrecioMasIVA() + "";
	}
	
	public String toStringForFactura() {
		String tab = "\t";
		if (this.denominacion.length() < 6) tab = "\t\t";
		return "" + 
				this.codigo + "\t| " +
				this.denominacion + tab + "| " + 
				this.precio_ud + "\t\t| " + 
				this.ud_vendidas + "\t\t| " +
				this.tipo + "\t| " +
				this.getPrecioFactura() + "\t\t| " +
				this.getPrecioMasIVA() + "";
	}
	
	public String toStringForFile() {
		return "" + 
				this.codigo + "::" +
				this.denominacion + "::" + 
				this.precio_ud + "::" + 
				this.ud_vendidas + "::" +
				this.tipo + "";
	}
	
}
