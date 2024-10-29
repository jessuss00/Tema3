package tema3JMG;

import java.util.Scanner;

public class Actividad4Boletin {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		System.out.println("Dime una cadena:");
		String cadena =ac.next();
		String caracter;
		String caracter1;
		String cadena2="";
		
		do {
			System.out.println("Dime un carcter");
			caracter = ac.next();
			System.out.println("Dime un carcter");
			caracter1 = ac.next();
			
		} while (caracter.length()!=1&&caracter1.length()!=1);
		
		for(int i=0;i<cadena.length();i++) {
			String letra = cadena.substring(i,i+1);
			
			if (letra.equalsIgnoreCase(caracter)) {
				cadena2 = cadena2 + caracter1;
			
			}else {
				cadena2 = cadena2 + letra;

			}
			
		}
		System.out.println(cadena2);

	}

}
