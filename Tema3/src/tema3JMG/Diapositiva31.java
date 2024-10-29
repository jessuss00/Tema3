package tema3JMG;

import java.util.Scanner;

public class Diapositiva31 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		int num;
		do {
			
			System.out.println("1. Opcion 1");
			System.out.println("2. Opcion 2");
			System.out.println("3. Opcion 3");
			System.out.println("4. Opcion 4");
			System.out.println("5. Salir ");  
			
			num=ac.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("Ejecutando la opcion 1");
				break;
			case 2:
				System.out.println("Ejecutando la opcion 2");
				break;
			case 3:
				System.out.println("Ejecutando la opcion 3");
				break;
			case 4:
				System.out.println("Ejecutando la opcion 4");
				break;
			case 5:
				System.out.println("Saliendo...");
				break;

			default:System.out.println("Saliendo...");
				break;
			}
			
		}while(num>=1&&num<=4);
			
		



}
}