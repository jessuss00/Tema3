package tema3JMG;



import java.util.Random;
import java.util.Scanner;

public class Diapostiva18 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		Random random = new Random();
		
		int  num1; 
		int num2;
		int respuesta;
		int acirtos =0;
		do {
			num1 = random.nextInt(100)+1;
			num2 = random.nextInt(100)+1 ;
			System.out.printf("Cuanto es el resultado de %d + %d", num1, num2);
			respuesta = ac.nextInt();
			if(num1+num2 == respuesta) {
				acirtos++;
				System.out.println("Enhorabuena");
				
			}
			} while (num1+num2 == respuesta);
		System.out.printf("Has acertado %d veces",acirtos);

	}

}
