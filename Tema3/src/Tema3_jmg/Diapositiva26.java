package Tema3_jmg;

import java.util.Scanner;

public class Diapositiva26 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		int num;
		do {
			System.out.println("Dime un numero");
			num =ac.nextInt();
		} while (num<=0||num >=10);
		System.out.println("La tabla del "+num);
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d = %d \n",num,i,num*i);		
			}
		
	}

}
