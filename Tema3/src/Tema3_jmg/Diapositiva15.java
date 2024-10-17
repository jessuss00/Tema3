package Tema3_jmg;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {
		Scanner ac= new Scanner(System.in);
		String vc="" ;
		do {
			System.out.println("Dame una letra");
			vc = ac.next();		
			} while (!(vc.equals("a"))
					&&
					!(vc.equals("e"))
					&&
					!(vc.equals("i"))
					&&
					!(vc.equals("o"))
					&&
					!(vc.equals("u"))
					);
		System.out.println("Es vocal");

	}

}
