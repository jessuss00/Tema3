package tema3JMG;

import java.util.Iterator;
import java.util.Scanner;

public class Actividad18Boletin {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero");
		num=ac.nextInt();
		String palotes="";

		for (int i = num; i > 0; i/=10) {
			int digito = i%10;
			for(int e=0;e<digito;e++) {
				palotes ="|" + palotes;
			}
			if (i>=10) {
				palotes ="-" + palotes;
			}
			
		
		}
		System.out.println(palotes);

	}

}
