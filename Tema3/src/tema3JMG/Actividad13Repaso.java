package tema3JMG;

import java.util.Iterator;
import java.util.Scanner;

public class Actividad13Repaso {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		String cadena="";
		int contadorMinuscula=0;
		int contadorMayuscula=0;
		int contadorNumero=0;
		int contadorCaracter=0;
		
		do {
			System.out.println("Dime tu contraseña");
			cadena=ac.next();
			for(int i=0;i<cadena.length();i++) {
				String letra = cadena.substring(i,i+1);
			
				if (letra.matches("[a-z]")) {
					contadorMinuscula++;
				}else if (letra.matches("[A-Z]")) {
					contadorMayuscula++;
				}else if (letra.matches("[0-9]")) {
					contadorNumero++;
				}else if (letra.matches("[@#$&]")) {
					contadorCaracter++;
				}
			}
			
		} while (cadena.length()<10||contadorCaracter<2||contadorMayuscula<2||contadorMinuscula<2||contadorNumero<2);
		
		System.out.println("Contraseña valida");
	}

}
