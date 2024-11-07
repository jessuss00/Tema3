package tema3JMG;

import java.util.Scanner;

public class Actividad10Boletin {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);

		System.out.println("Dame un numero");
		int base = ac.nextInt();
		System.out.println("Dime su exponente");
		int exponente = ac.nextInt();
		int resultado = 1;
		for (int i = 1; i <= exponente; i++) {
			resultado *= base;
		}
		System.out.println(resultado);
	}

}
