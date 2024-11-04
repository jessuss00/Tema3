package tema3JMG;

import java.util.Scanner;

public class Activida2JMG {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		int contador = 0;
		int contadorImpares =0;
		int acumuladorImpa =0;
		int mayorPares =0;
		int numero;
		
		do {
			System.out.println("Dime un numero positivo");
			numero = ac.nextInt();
			contador++;
			if (numero%2==0) {
				if (numero>mayorPares) {
					mayorPares=numero;
				}
			}else {
				contadorImpares++;
				acumuladorImpa = acumuladorImpa + numero;
			}
		} while (numero>0);
		int promedio=acumuladorImpa/contadorImpares;
		System.out.printf("Me has dado %d numeros, el mayor par que me has dicho es %d y la media de los impares es %d", contador-1, mayorPares, promedio);

	}

}
