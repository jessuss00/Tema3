package tema3JMG;

import java.util.Scanner;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		Scanner ac =new Scanner(System.in);
		String cadena="";
		int minuscula=0;
		int mayuscula=0;
		int numero=0;
		int caracter=0;
		
		do {
			System.out.println("Dime tu contraseña");
			cadena=ac.nextLine();
			
			for(int i=0;i<cadena.length();i++) {
				String letra=cadena.substring(i,i+1);
				System.out.println(letra);
				
				if (letra.matches("[a-z]")) {
					minuscula++;
				
				}else if (letra.matches("[A-Z]")) {
					mayuscula++;
				}else if (letra.matches("[0-9]")) {
					numero++;
				}else if (letra.matches("[@#,.€]")) {
					caracter++;
				}
			}
		} while (cadena.length()<10||minuscula<2||mayuscula<2||numero<2||caracter<2);
		System.out.println("Contraseña valida");

	}

}
