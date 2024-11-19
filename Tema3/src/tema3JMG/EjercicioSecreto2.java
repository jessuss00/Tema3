package tema3JMG;

import java.util.Random;
import java.util.Scanner;

public class EjercicioSecreto2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner ac=new Scanner(System.in);
		int contrasenna=0;
		int combi= rand.nextInt(1000,10000);
		System.out.println(combi);
		
		int contador=0;
		do {
			System.out.println("Introduzca contraseña");
			contrasenna=ac.nextInt();
			contador++;
			if (contrasenna!=combi) {
				System.out.println("Contraseña Incorrecta");
			}
			
			
		} while (contrasenna!=combi&&contador<4);
		if (contrasenna==combi ) {
			System.out.println("Entre");
		}else if (contador>4) {
			System.out.println("Agotado fallos");
		} 
		
		
	}

}
