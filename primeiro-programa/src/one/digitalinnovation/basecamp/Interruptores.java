package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 2 de Loops e Arrays.
 */

public class Interruptores {

	public static void main(String[] args) {

		System.out.println("BREAK");

		// Sem label
		while (true) {
			System.out.println("Não vai ser infinito...");
			break;
		}

		System.out.println(); // Pular linha
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("i: " + i);
		}

		System.out.println(); // Pular linha
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				if (k == 2) {
					break;
				}
				System.out.println("i: " + i + " k: " + k);
			}
		}

		System.out.println(); // Pular linha
		int i = 0;
		do {
			if (i == 3) {
				break;
			}
			System.out.println("i: " + i);
			i++;
		} while (i < 5);

		System.out.println("\nMostrando de 1 até 14.");
		for (int x = 1; x <= 14; x++) {
			if (x == 12) {
				break;
			}

			if (x % 2 != 0) {
				continue;
			}
			System.out.println("X: " + x);

		}

		System.out.println("\n1 até 14 com WHILE.");
		int h = 1;
		while (h <= 14) {

			if (h == 12) {
				break;
			}

			if (h % 2 == 0) {
				System.out.println("h: " + h);
				h++;
			} else {
				h++;
				continue;
			}
		}

	}
}