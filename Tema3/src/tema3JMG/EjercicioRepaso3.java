package tema3JMG;

import java.util.Scanner;

public class EjercicioRepaso3 {

	public static void main(String[] args) {
		Scanner ac =new Scanner(System.in);
		
		int numero;
		int numeroBuenaSuerte=0;
		int numeroMalaSuerte=0;
		
		do {
			System.out.println("Dime un numero");
			numero=ac.nextInt();
			int numeroCopia=numero;
			
			
			
			
		} while (numero<0);
		
		while(numero>0) {
			int digito=numero%10;
			System.out.println(digito);
			
			if (digito==7||digito==3||digito==8||digito==9) {
				numeroBuenaSuerte++;
			}else  {
				numeroMalaSuerte++;
			}
			numero=numero/10;
		}
		
		if (numeroMalaSuerte>numeroBuenaSuerte) {
			System.out.println("Mala suerte");
		}else {
			System.out.println("Buena suerte");
		}
	}

}
