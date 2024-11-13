package tema3JMG;

import java.util.Scanner;

public class Actividad14Repaso {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		
		int contadorBuenaSuerte=0;
		int contadorMalaSuerte=0;
	
		System.out.println("Dime un numero y vamos a comprobar si es de la buena suerte o no");
		int numero=ac.nextInt();
		
		for(int i=numero;i>10;i/=10) {
			int digito=i%10;
			
			if (digito==7||digito==3||digito==8||digito==9) {
				contadorBuenaSuerte++;
			}else {
				contadorMalaSuerte++;
			}
		}
		if (contadorBuenaSuerte>contadorMalaSuerte) {
			System.out.println("Tu numero es de buena suerte");
		}else {
			System.out.println("Tu numero es de mala suerte");
		}

	}

}
