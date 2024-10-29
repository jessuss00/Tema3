package tema3JMG;

import java.util.Scanner;

public class Diapositiva10 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		int par = 1;
		
		while(par !=0) {
			System.out.println("Dime un numero");
			par = ac.nextInt();
			if (par%2==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
			
		}

	}

}
