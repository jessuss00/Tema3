package tema3JMG;

import java.util.Random;

public class Actividad16Boletin {

	public static void main(String[] args) {
		Random rand = new Random();
		int francia = 0;
		int inglaterra = 0;
		int empape = 0;

		int aleatorio = rand.nextInt(100000000, 1000000000);

		for (int i = aleatorio; i > 0; i /= 10) {
			int digito = i % 10;
			if (digito % 2 == 0) {
				francia++;
				if (digito % 4 == 0) {
					empape++;
				}
			} else {
				inglaterra++;
			}
		}
		System.out.printf("Numero generado %d \nFrancia %d - %d Inglaterra \nGoles de Mbappe: %d", aleatorio, francia,
				inglaterra, empape);
	}

}
