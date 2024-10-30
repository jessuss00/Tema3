package tema3JMG;

import java.util.Scanner;

public class diapositiva28 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int num1;

		do {

			System.out.println("Dime un numero(positivo)");
			num1 = ac.nextInt();
		} while (num1 <= 0);

		while (num1 > 0) {
			int unidades = num1 % 10;
			num1 /= 10;
			System.out.println(unidades);
		}
	}

}
