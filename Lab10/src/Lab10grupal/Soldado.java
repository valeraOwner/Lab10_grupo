package Lab10grupal;

import java.util.*;
public class Soldado {
	static Scanner sc = new Scanner(System.in);
	private String Nombre;
	private int FilActual;
	private int ColumActual;
	private int Nataque;
	private int Ndefensa;
	private int VActual;
	private int Velocidad=0;
	private String actitud;
	private boolean vive;
	public Soldado(String Nombre){
		this.Nombre=Nombre;
	}
	public Soldado(){
	}
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	public String getNombre() {
		return this.Nombre;
	}
	public void Atacar() {
		int direccion;
		System.out.println("1.Derecha");
		System.out.println("2.Izquierda");
		System.out.println("3.Arriba");
		System.out.println("4.Abajo");
		direccion = sc.nextInt();
		if(direccion == 1) {
			this.setColumActual(getColumActual()-1);
		}
		else if(direccion == 2) {
			this.setColumActual(getColumActual()+1);
		}
		else if(direccion == 3) {
			this.setFilActual(getFilActual()+1);
		}
		else if(direccion == 4) {
			this.setFilActual(getFilActual()-1);
		}
		Velocidad++;
	}
	public void Defender() {
		Velocidad = Velocidad;
	}
	public void avanzar() {
		Velocidad++;
	}
	public void retroceder() {
		if(Velocidad > 0) {
			Defender();
		}
		else if(Velocidad < 0) {
			Velocidad--;
		}
	}
	public void serAtacado() {
		VActual--;
		if(VActual == 0) {
			morir();
		}
	}
	public void huir(){
		Velocidad+=2;
	}
	public void morir(){
		System.out.println("Soldado "+getNombre()+" murió");
		setColumActual(10);
	}
	public void setVidaActual(int VActual){
		this.VActual=VActual;
	}
	public int getVidaActual() {
		return this.VActual;
	}
	public void setFilActual(int FilActual){
		this.FilActual = FilActual;
	}
	public int getFilActual() {
		return this.FilActual;
	}
	public void setColumActual(int ColumActual){
		this.ColumActual = ColumActual;
	}
	public int getColumActual() {
		return this.ColumActual;
	}
	
	public String ToString() {
		return "Nombre: "+Nombre+"\tVida: "+VActual+" \tFila: "+(FilActual+1)+" \tColumna: "+(ColumActual+1);
	}
}