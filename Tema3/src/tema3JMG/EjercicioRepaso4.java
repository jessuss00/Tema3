package tema3JMG;

import java.util.Random;

public class EjercicioRepaso4 {

	public static void main(String[] args) {
		Random ac = new Random();	
		int francia=0;
		int inglaterra=0;
		int goles=0;
		int aleatorio= ac.nextInt(10000,10000000);
		System.out.println(aleatorio);
		
		for(int i=aleatorio;i>0;i/=10) {
			int digito=i%10;
			System.out.println(digito);
			if (digito%2==0) {
				francia++;
				if (digito%4==0) {
					goles++;
				}
			}else  {
				inglaterra++;
			}
		}
		System.out.println("jhjjjjjjjjjjjjjjjjjjjjjjjjj");
		System.out.println(francia);
		System.out.println(inglaterra);
		System.out.println(goles);
	
	}

}
