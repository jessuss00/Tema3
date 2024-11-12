package tema3JMG;

import java.util.Scanner;

public class EjercicioSecreto1 {

	public static void main(String[] args) {
		int numeroAnterior=0;
		int actual=1;
		int siguiente=0;
		int alReves=0;
	
		Scanner ac= new Scanner(System.in);
		
		System.out.println("Dime los n primeros numeros");
		int num=ac.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println(numeroAnterior);
			siguiente=numeroAnterior + actual;
			numeroAnterior =actual;
			actual=siguiente;
		}
		System.out.println("Ahora al reves");
		
		//siguiente 89
		//actual 89
		//anterior 55
		// siguiente = actual
		// actual = anterior
		// anterior = siguiente - anterior
		
		for(int i=1;i<=num;i++) {
			siguiente = actual;
			actual = numeroAnterior;
			numeroAnterior = siguiente - numeroAnterior;

			System.out.println(numeroAnterior);
			
		}

	}

}
