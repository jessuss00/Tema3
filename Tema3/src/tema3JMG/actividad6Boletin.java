package tema3JMG;

import java.util.Scanner;

public class actividad6Boletin {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);

		System.out.println("Dime una cadena:");
		String cadena = ac.next();
		
		String cadenaFinal = "";

		for (int i = cadena.length()-1; i >=0; i--) {
			String letra = cadena.substring(i, i + 1); 
			cadenaFinal += letra;
		}
		if (cadena.equalsIgnoreCase(cadenaFinal)) {
			System.out.println("Es palindroma");
		}else {
			System.out.println("No es palindroma");
		}

	}

}
