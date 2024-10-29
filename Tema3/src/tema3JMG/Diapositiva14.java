package tema3JMG;

import java.util.Scanner;

public class Diapositiva14 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int numero =0;
		do {
			System.out.println("Dame un valor");
			numero =ac.nextInt();
			
		} while (numero <=0 || numero >=10);

	}

}
