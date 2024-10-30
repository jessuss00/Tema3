package tema3JMG;

import java.util.Scanner;

public class Actividad14Boletin {

	public static void main(String[] args) {

		Scanner ac = new Scanner(System.in);
		int num1;
		int buenaSuerte = 0;
		int malaSuerte = 0;


		do {

			System.out.println("Dime un numero(positivo)");
			num1 = ac.nextInt();
		} while (num1 <= 0);
		int numero1 =num1;
		
		while (num1 > 0) {
			int digito = num1 % 10;
			if (digito ==7||digito ==3||digito ==8||digito ==9) {
				buenaSuerte++;
			}else {
				malaSuerte++;
			}
				num1 /= 10;
		}
		if (buenaSuerte>malaSuerte) {
			System.out.printf("El numero %d es de buena suerte",numero1);
		}else {
			System.out.printf("El numero %d es de mala suerte",numero1);

		}
			
			
			
			

			}
		

	}


