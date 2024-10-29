package tema3JMG;

import java.util.Scanner;

public class Actividad1Boletin {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		String caracter;
		do {
			System.out.println("Dame un caracter");
			caracter = ac.next();

			if (caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i")
					|| caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u")) {
				System.out.println("Es vocal");
			} else if(!caracter.equalsIgnoreCase(".")){
				System.out.println("No vocal");
			}
		} while (!caracter.equalsIgnoreCase("."));

	}

}
