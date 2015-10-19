package Juego_Marcianos;

import java.util.Scanner;

public class Juego {
	
	
	public static void main(String[] args){
		Marcianos marcianos;
		Computadora computadora;
		Jugador jugador;
		
		marcianos=Marcianos.getMarcianos();
		computadora=new Computadora();
		jugador=new Jugador();
		Scanner sc=new Scanner(System.in);
		
		int disparos;
		
		do {
			System.out.println("Digite la cantidad de disparos");
			
			disparos=sc.nextInt();
			
			for (int i = 0; i < disparos; i++) {
				jugador.destruirMarciano();
				
			}
			
			
			computadora.crearMarcianos();
			marcianos.cuantosQuedan();
		} while (disparos != 0);
		
	}
	

}
