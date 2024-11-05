package tema3JMG;

import java.util.Scanner;

public class Actividad3JMG {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Dime un numro: ");
		long numero =ac.nextLong();
		
		int sumaPares =0;
		int pares =0;
		
		for(long i=numero;i>0;i/=10) {
			int digito = (int) i%10;
			if (digito%2==0) {
				pares++;
				sumaPares += digito;
			}
		}
		System.out.printf("Tu numero tiene %d digitos pares y la suma de esos numeros %d", pares, sumaPares);
		
	}

}
