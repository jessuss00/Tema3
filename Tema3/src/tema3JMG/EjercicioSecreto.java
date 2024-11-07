package tema3JMG;

import java.util.Scanner;

public class EjercicioSecreto {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero=ac.nextInt();
		
		boolean primo =true;
		for(int i =2;i<numero;i++) {
			if (numero%i==0) {
				primo=false;
			}
			
		}
		if (primo==true) {
			System.out.println("es primo");
		}else {
			System.out.println("No Es primo");
		}
	}

}
