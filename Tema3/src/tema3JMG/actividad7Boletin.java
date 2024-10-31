package tema3JMG;

import java.util.Scanner;

public class actividad7Boletin {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		System.out.println("Cuantos numeros me vas a decir");
		int numero = ac.nextInt();
		int contador=0;
		int numero2 =0;
		int contador2 =0;
		int contador3 =0;
		
		for(int i=0;i<numero;i++) {
			System.out.println("Dime el numero");
			numero2 =ac.nextInt();
			if (numero2<0) {
				contador++;
			}else if (numero2>0) {
				contador2++;
			}else if (numero2==0) {
				contador3++;
			}
		
		}
		
		System.out.printf("Tenemos %d mayores de 0, %d menores de 0, %d iguales de 0",contador2, contador,contador3);

	}

}
