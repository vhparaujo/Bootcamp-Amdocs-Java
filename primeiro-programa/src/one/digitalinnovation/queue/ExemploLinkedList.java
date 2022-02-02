package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {

		Queue<String> filaBanco = new LinkedList<>(); // Criação do queue - linkedlist, filas.

		filaBanco.add("Mane");
		filaBanco.add("Messi");
		filaBanco.add("Neymar");
		filaBanco.add("Cr7");
		filaBanco.add("Salah");
		filaBanco.add("Lukaku");

		System.out.println("Mostrar fila do Banco: " + filaBanco);

		String clienteAtendido = filaBanco.poll(); // Mostra o primeiro da fila e o retira da fila.
		System.out.println("Cliente Atendido: " + clienteAtendido);
		System.out.println("Fila do banco após o primeiro cliente ser atendido: " + filaBanco);

		String primeiroCliente = filaBanco.peek(); // Mostra o primeiro da fila, mas não o retira da fila e retorna null
													// quando vazio.
		System.out.println("Próximo cliente: " + primeiroCliente);
		System.out.println("Fila: " + filaBanco);

		String primeiroClienteOuErro = filaBanco.element(); // Mostra o primeiro da fila sem o retirá-lo desta e mostra
															// uma mensagem de erro quando vazio.
		System.out.println("Novamente primeiro cliente: " + primeiroClienteOuErro);
		System.out.println("Fila: " + filaBanco);

		System.out.print("Fila em loop: ");
		for (String cliente : filaBanco) {

			System.out.print(cliente + " - ");
		}

		System.out.println();
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		while (iteratorFilaBanco.hasNext()) {

			System.out.println("--> " + iteratorFilaBanco.next());
		}

		System.out.println("Tamanho da fila: " + filaBanco.size());

		System.out.println("Fila está vazia? " + filaBanco.isEmpty());

	}

}
