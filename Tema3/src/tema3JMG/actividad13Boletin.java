package tema3JMG;

import java.util.Scanner;

public class actividad13Boletin {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		String cadena="";
		int cadenaFinal=0;
		int mayusculas=0;
		int minusculas=0;
		int numero=0;
		int caracter=0;
		do {
			System.out.println("Dime tu controseña");
			cadena=ac.next();
			for(int i=0;i<cadena.length();i++) {
				String letra = cadena.substring(i,i+1);
				if (letra.matches("[a-z]")) {
					minusculas++;
				}else if (letra.matches("[A-Z]")) {
					mayusculas++;
				}else if (letra.matches("[0-9]")) {
					numero++;
				}else if (letra.matches("[@#%&/*]")) {
					caracter++;
				}
			}
			
			} while (cadena.length()<10||minusculas<2||mayusculas<2||numero<2||caracter<2);
			System.out.println("Contraseña valida");
	}

	}


