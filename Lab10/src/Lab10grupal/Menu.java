/*Laboratorio - 10
 * 
- Joe Daniel Flores Choquehuanca
- Kristen Fernández Cardenas 
- Jeanpier Michaelson Valera Yana
- Manuel Mario Champi Sanchez
- Gabriela Vanessa Martell Villanueva

Fecha: 08-11-2022
*/
package Lab10grupal;

import java.util.*;
public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void main (String []args ) {
		
		Ejercito num1=new Ejercito ();
		num1.llenar();
		num1.FilColum1();
		num1.MostrarEjercito();
		Ejercito num2=new Ejercito();
		num2.llenar();
		num2.FilColum2(num1);
		num2.MostrarEjercito();
		num1.LlenarTabla(num2);
		num1.MostarTabla();
		num1.MayorDelEjercito();
		num2.MayorDelEjercito();
		num1.Promedio();
		num2.Promedio();
		System.out.println("\n");
		posicion(num1, num2);
		
		
	}
	public static void posicion(Ejercito num1, Ejercito num2) {
		while(true) {
			int accion;
			System.out.println("Jugador ");
			System.out.println("Que acción desea realizar?");
			System.out.println("1. Atacar");
			System.out.println("2. Defender");
			System.out.println("3. Avanzar");
			System.out.println("4. Retroceder");
			System.out.println("5. Huir");
			accion = sc.nextInt();
			int x, y;
			System.out.println("Posición x:");
			x = sc.nextInt();
			System.out.println("Posicion y:");
			y = sc.nextInt();
			if(accion == 1) {
				for(int i =0; i< num1.Cantidad.length; i++) {
					if(num1.Cantidad[i].getFilActual() == (y-1) &&
							num1.Cantidad[i].getColumActual()== (x-1)) {
						num1.Cantidad[i].Atacar();
						num2.Cantidad[i].serAtacado();
						break;
					}
				}
			}
			else if(accion == 2) {
				for(int i = 0; i < num1.Cantidad.length;i++) {
					if(num1.Cantidad[i].getFilActual() == (y-1) &&
							num1.Cantidad[i].getColumActual()== (x-1)) {
						num1.Cantidad[i].Defender();
						break;
					}
				}
			}
			else if(accion == 3) {
				for(int i = 0; i < num1.Cantidad.length;i++) {
					if(num1.Cantidad[i].getFilActual() == (y-1) &&
							num1.Cantidad[i].getColumActual()== (x-1)) {
						num1.Cantidad[i].avanzar();
						break;
					}
				}
			}
			else if(accion == 4) {
				for(int i = 0; i < num1.Cantidad.length;i++) {
					if(num1.Cantidad[i].getFilActual() == (y-1) &&
							num1.Cantidad[i].getColumActual()== (x-1)) {
						num1.Cantidad[i].retroceder();
						break;
					}
				}
			}
			else if(accion == 5) {
				for(int i = 0; i < num1.Cantidad.length;i++) {
					if(num1.Cantidad[i].getFilActual() == (y-1) &&
							num1.Cantidad[i].getColumActual()== (x-1)) {
						num1.Cantidad[i].huir();
						break;
					}
				}
			}
			num1.MostrarEjercito();
			num2.MostrarEjercito();
			num1.LlenarTabla(num2);
			num1.MostarTabla();
			System.out.println("Cambio de jugador");
		}
	}
}
