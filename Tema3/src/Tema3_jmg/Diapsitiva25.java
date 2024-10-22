package Tema3_jmg;

import java.util.Scanner;

public class Diapsitiva25 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		int n;
		int suma=0;
		double media;
		for(int i=1;i<=10;i++) {
			System.out.println("Dime un numero");
			n=ac.nextInt();
			suma+=n;
		}
		media = suma/10.0;
		System.out.println("La media es "+media);

	}

}
