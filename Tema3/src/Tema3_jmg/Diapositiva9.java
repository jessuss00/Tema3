package Tema3_jmg;

import java.util.Scanner;

public class Diapositiva9 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		int n=0;
		int suma=0;
		while(n<=10) {
			System.out.println("Dame un valor");
			int beti = ac.nextInt();
			suma = suma +beti;
			n++;
		}
		double promedio = 1.0* suma /n;
		System.out.println("La suma de tus numeros es: "+ suma);
		System.out.printf("El promedio de tus numeros es %.2f ", promedio);

	}

}
