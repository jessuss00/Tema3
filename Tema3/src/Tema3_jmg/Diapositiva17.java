package Tema3_jmg;

import java.util.Scanner;

public class Diapositiva17 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		int n=0;
		int suma=0;
		do {
			System.out.println("Dame un valor");
			int beti = ac.nextInt();
			suma = suma +beti;
			n++;
		} while (n<=10);
		double promedio = 1.0* suma /n;
		System.out.println("La suma de tus numeros es: "+ suma);
		System.out.printf("El promedio de tus numeros es %.2f ", promedio);


	}

}
