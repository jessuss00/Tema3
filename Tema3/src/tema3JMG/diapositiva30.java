package tema3JMG;

import java.util.Scanner;

public class diapositiva30 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		int contador = 0;
		for(int i=0;i<5;i++) {
			System.out.println("Dime la nota del alumno " + (i+1));
			int nota =ac.nextInt();
			if(nota<5) {
				contador++;
			}
		}
		System.out.printf("hay %d suspensos %n", contador);

	}

}
