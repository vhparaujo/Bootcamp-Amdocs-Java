package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Loops e Arrays.
 */

public class TesteDeLoops {

	public static void main(String[] args) {

		System.out.println("De 0 até 9. ");
		for (int i = 0; i < 10; i++) {
			System.out.println("O valor de i é: " + i);
		}

		System.out.println("\nDe 10 até 0. ");
		for (int i = 10; i >= 0; i--) {
			System.out.println("O valor de i é: " + i);
		}

		boolean variavel = true;
		while (variavel) {
			System.out.println("\nExecutanto while uma vez...");
			variavel = false;
		}

		int tentativas = 1;
		int limiteTentativas = 3;
		System.out.println(); // pular uma linha
		while (tentativas <= limiteTentativas) {
			System.out.println("Tentando " + tentativas + " vez(es).");
			tentativas++;
		}

		tentativas = 1;
		limiteTentativas = 3;
		System.out.println(); // pular uma linha
		do {
			System.out.println("Tentando " + tentativas + " vez(es).");
			tentativas++;
		} while (tentativas <= limiteTentativas);

		System.out.println("\nMostrando de 3 até 11.");
		for (int x = 3; x <= 11; x = x + 2) {
			if (x != 7) {
				System.out.println("Valor de i: " + x);
			}
		}

		System.out.println("\nExibir texto 5 vezes.");
		int vez = 1;
		while (vez <= 5) {
			System.out.println("Exibindo o texto a " + vez + " º vez.");
			vez++;
		}

		// Exibindo texto 5 vezes com uma variável booleana.
		System.out.println("\nTexto 5 vezes");
		vez = 1;
		boolean continuar = true;
		while (continuar) {
			System.out.println("Exibindo o texto a " + vez + "° vez");
			vez++;
			if (vez > 5) {
				continuar = false;
			}
		}
	}
}