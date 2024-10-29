package tema3JMG;

import java.util.Iterator;
import java.util.Scanner;

public class Actividad2Boletin {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		System.out.println("Dime una cadena:");
		String cadena =ac.next();
		String caracter;
		do {
			System.out.println("Dime un carcter");
			caracter = ac.next();
		} while (caracter.length()!=1);
		
		int contador = 0;
		for(int i=0;i<cadena.length();i++) {
			String letra = cadena.substring(i,i+1);
			
			if (letra.equalsIgnoreCase(caracter)) {
				contador++;
			}
			
		}
		System.out.println(contador);

	}

}
