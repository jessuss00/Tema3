package tema3JMG;

import java.util.Scanner;

public class ejemploDobleBucle {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		int num;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (int e = 1; e <= 10; e++) {
				System.out.printf("%d X %d = %d \n", i, e, e * i);
			}
			System.out.println("-------------------------------------------");
		}

	}

}
