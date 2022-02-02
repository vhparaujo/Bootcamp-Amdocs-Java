package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

	public static void main(String[] args) {

		Queue<String> filaNomes = new LinkedList<>();

		filaNomes.add("Juliana");
		filaNomes.add("Pedro");
		filaNomes.add("Carlos");
		filaNomes.add("Larissa");
		filaNomes.add("João");

		for (String nomes : filaNomes) { // Exibir os nomes
			System.out.println(nomes);
		}

		String primeiroNome = filaNomes.peek(); // Primeiro nome da fila sem tirar da fila.
		System.out.println("\nPrimeiro nome: " + primeiroNome);
		System.out.println(filaNomes);

		String primeiroNomeRemovido = filaNomes.poll(); // Primeiro nome da fila tirando da fila.
		System.out.println("\nPrimeiro nome: " + primeiroNomeRemovido);
		System.out.println(filaNomes);

		filaNomes.add("Daniel");
		System.out.println("\n" + filaNomes);

		int tamanho = filaNomes.size();
		System.out.println("Tamanho da fila: " + tamanho);

		System.out.println("Fila está vazia? " + filaNomes.isEmpty());

		Boolean carlos = filaNomes.contains("Carlos");
		System.out.println("Carlos está na fila? " + carlos);
	}

}
