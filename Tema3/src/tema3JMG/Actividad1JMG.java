package tema3JMG;

import java.util.Scanner;

public class Actividad1JMG {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		System.out.println("Dime una cadena:");
		String cadena =ac.next();
		String cadenaFinal="";
		
		
		for(int i=0;i<cadena.length();i++) {
			String letra = cadena.substring(i,i+1);

			if (letra.equals(letra.toLowerCase())) {
				cadenaFinal =cadenaFinal +letra.toUpperCase();
				
		

			}else {
				cadenaFinal =cadenaFinal +letra.toLowerCase();

			}
			
		}
		System.out.println(cadenaFinal);

	}

}
