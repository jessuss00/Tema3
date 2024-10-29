package tema3JMG;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int numero1 =0;
		int numero2 =0;
		do {
			System.out.println("Dime un numero1: ");
			numero1 = ac.nextInt();
			System.out.println("Dime un numero2: ");
			numero2 = ac.nextInt();
		} while (numero1 !=numero2);
		System.out.println("Los numeros son iwales primillo");
	}

}
