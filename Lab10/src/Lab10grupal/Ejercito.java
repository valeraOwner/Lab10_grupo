package Lab10grupal;

import java.util.*;
public class Ejercito {
	private static int Numero=0;
	public Soldado []Cantidad;
	public String [][] tabla;
	public Ejercito() {
		Numero++;
	}
	public void llenar() {
		int num=(int)(Math.random()*10+1);
		System.out.println("Número de soldados: "+num);
		Cantidad=new Soldado[num];
		for (int i=0;i<Cantidad.length;i++) {
			//Nombre
			Cantidad[i]=new Soldado();
			String Nombre="Soldado "+i+"X"+Numero;
			Cantidad[i].setNombre(Nombre);
			//Vida
			int Vida=(int)(Math.random()*5+1);
			Cantidad[i].setVidaActual(Vida);
		}
	}
	public void FilColum1() {
		for(int i = 0; i < Cantidad.length; i++) {
			int Fila=(int)(Math.random()*9);
			int Columna=(int)(Math.random()*9);
			int j1 = 0;
			while(j1<i) {
				if(Cantidad[j1].getFilActual()==Fila &&
						Cantidad[j1].getColumActual()==Columna) {
					Fila=(int)(Math.random()*9);
					Columna=(int)(Math.random()*9);
					j1=0;
					break;
				}
				else if(j1 == i-1 ) {
					j1++;
				}
				else {
					j1++;
				}
			}
			Cantidad[i].setFilActual(Fila);
			Cantidad[i].setColumActual(Columna);
		}
	}
	public void FilColum2(Ejercito ejercito1) {
		int Fila=0;
		int Columna=0;
		for(int i = 0; i < Cantidad.length; i++) {
			Fila=(int)(Math.random()*9);
			Columna=(int)(Math.random()*9);
			int j1 = 0;
			while(j1<i) {
				if(this.Cantidad[j1].getFilActual()==Fila &&
						this.Cantidad[j1].getColumActual()==Columna) {
					Fila=(int)(Math.random()*9);
					Columna=(int)(Math.random()*9);
					j1=0;
					break;
				}
				else if(j1 == i-1 ) {
					j1++;
				}
				else {
					j1++;
				}
			}
			this.Cantidad[i].setFilActual(Fila);
			this.Cantidad[i].setColumActual(Columna);
		}
		for(int i = 0; i < ejercito1.Cantidad.length; i++) {
			int j1 = 0;
			while(j1<=i) {
				if(ejercito1.Cantidad[j1].getFilActual()==Fila &&
						ejercito1.Cantidad[j1].getColumActual()==Columna) {
					Fila=(int)(Math.random()*9);
					Columna=(int)(Math.random()*9);
					j1=0;
					break;
				}
				else if(j1 == i-1 ) {
					j1++;
				}
				else {
					j1++;
				}
			}
			this.Cantidad[i].setFilActual(Fila);
			this.Cantidad[i].setColumActual(Columna);
		}
	}
	public void MostrarEjercito() {
		System.out.println("Ejercito "+Numero);
		for (int i =0;i<Cantidad.length;i++) {
			System.out.println(Cantidad[i].ToString());
		}
	}
	public void LlenarTabla(Ejercito ejercito2) {
		tabla = new String [10][11];
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = "[ ]";
				for(int k = 0; k<this.Cantidad.length; k++) {
					if(i == Cantidad[k].getFilActual() && j ==
							Cantidad[k].getColumActual()) {
						tabla[i][j] = "[ (-_-) ]";
					}
				}
				for(int k = 0; k<ejercito2.Cantidad.length; k++) {
					if(i == ejercito2.Cantidad[k].getFilActual() && j ==
							ejercito2.Cantidad[k].getColumActual()) {
						tabla[i][j] = "[ (°_°) ]";
					}
				}
			}
		}
	}
	public void MostarTabla() {
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla[i].length-1; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println("\n");
		}
	}
	public void MayorDelEjercito() {
		int mayor = this.Cantidad[0].getVidaActual();
		int indice = 0;
		for (int i = 0; i < this.Cantidad.length; i++) {
			if(this.Cantidad[i].getVidaActual() > mayor) {
				mayor =this.Cantidad[i].getVidaActual() ;
				indice = i;
			}
		}
		System.out.println("Soldado con mayor Nivel de vida es: ");
		System.out.println(Cantidad[indice]);
	}
	public void Promedio() {
		int promedio=0;
		for(int i =0; i < Cantidad.length; i++)
			promedio = promedio+Cantidad[i].getVidaActual();
		promedio = promedio/Cantidad.length;
		System.out.println("Promedio de Vida de todos los soldados es: "+promedio);
	}
}
