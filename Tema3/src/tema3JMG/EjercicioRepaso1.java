package tema3JMG;

import java.util.Iterator;
import java.util.Scanner;

public class EjercicioRepaso1 {

	public static void main(String[] args) {
		//Ejercicio 10 boletin
		
		Scanner ac= new Scanner(System.in);
		
		System.out.println("Dime un numero(base)");
		int base=ac.nextInt();
		System.out.println("Dime un exponente");
		int exponente=ac.nextInt();
		
		int resultado=1;
		for(int i=0;i<exponente;i++) {
			resultado*=base;
		}System.out.println(resultado);

	}

}
