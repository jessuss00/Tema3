package tema3JMG;

import java.util.Scanner;

public class Actividad4Repaso {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		
		String caracter1="";
		String caracter2="";
		String aux="";
		
		
		
			System.out.println("Dime una cadena");
			String cadena=ac.next();
			
		do {
			System.out.println("Dme un caracter");
			caracter1=ac.next();
			System.out.println("Dime otro caracter");
			caracter2=ac.next();
		} while (caracter1.length()!=1&&caracter2.length()!=1);
		
		
		for (int i=0;i<cadena.length();i++) {
			String letra =cadena.substring(i, i+1);
			
			if (letra.equalsIgnoreCase(caracter1)) {
				aux= aux+caracter2;
			}else {
				aux =  aux+letra;
			}
		}
		System.out.println(aux);

	}

}
