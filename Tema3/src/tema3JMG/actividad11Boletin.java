package tema3JMG;

import java.util.Scanner;

public class actividad11Boletin {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		int num=5;
		int suma=0;
		for(int i=1;i<21;i++) {
			num=num*2;
			System.out.printf("En el mes %d pagamos %d %n",i,num);
			suma+=num;
		}
		System.out.println("En total es "+suma);
	}

}
