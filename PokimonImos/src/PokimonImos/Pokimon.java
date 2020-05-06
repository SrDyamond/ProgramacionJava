package PokimonImos;
public class Pokimon {
	private String nombre;
	private float peso;
	private float altura;
	private String tipo;
	private String fecha;
	private char genero;
	private int ps;
	private int nivel;
	
	Pokimon (String n,float p,float a,String t,String f,char g,int ps,int lvl){
		this.nombre=n;
		this.peso=p;
		this.altura=a;
		this.tipo=t;
		this.fecha=f;
		this.genero=g;
		this.ps=ps;
		this.nivel=lvl;
	}
	
	Pokimon(){}
	
	public String getNombre() {
		return this.nombre;
	}
	public float getPeso() {
		return this.peso;
	}
	public float getAltura() {
		return this.altura;
	}
	public String getTipo() {
		return this.tipo;
	}
	public String getFecha() {
		return this.fecha;
	}
	public char getGenero() {
		return this.genero;
	}
	public int getPs() {
		return this.ps;
	}
	public int getNivel() {
		return this.nivel;
	}
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	public void setPeso(float pes) {
		this.peso=pes;
	}
	public void setAltura(float alt) {
		this.altura=alt;
	}
	public void setTipo(String tip) {
		this.tipo=tip;
	}
	public void setFecha(String fech) {
		this.fecha=fech;
	}
	public void setGenero(char gen) {
		this.genero=gen;
	}
	public void setPs(int peese) {
		this.ps=peese;
	}
	public void setNivel(int lvl) {
		this.nivel=lvl;
	}
}
