package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Suarez");
		nomes.add("Victor");
		nomes.add("Alcaraz");
		nomes.add("Medvedev");
		nomes.add("Djokovic");
		nomes.add("Nadal");

		System.out.println(nomes);

		nomes.set(3, "Aliassime");
		System.out.println(nomes);

		Collections.sort(nomes); // Ordena em ordem alfabética.

		nomes.set(2, "Federer"); // Altera o elemento do índice informado.
		System.out.println(nomes);

		nomes.remove(5); // Remove um elemento.
		System.out.println(nomes);

		nomes.remove("Nadal"); // Remove um elemento.
		System.out.println(nomes);

		String nome = nomes.get(2); // Obtém o elemento do índice.
		System.out.println(nome);

		int tamanho = nomes.size(); // Mostra quantos elementos tem no array.
		System.out.println(tamanho);

		nomes.remove("Suarez");
		tamanho = nomes.size();
		System.out.println(tamanho);

		boolean temNome = nomes.contains("Federer"); // Booleano que informa se há ou não um elemento no array.
		System.out.println(temNome);

		temNome = nomes.contains("Berretini"); // Booleano que informa se há ou não um elemento no array.
		System.out.println(temNome);

		boolean listaVazia = nomes.isEmpty(); // Booleano retorna se a lista tem elementos ou não.
		System.out.println(listaVazia);

		int posicao = nomes.indexOf("Federer"); // Mostra a posiçao do elemento
		System.out.println(posicao);

		for (String nomeDoItem : nomes) { // Testar a iteração do array.
			System.out.println("--> " + nomeDoItem);
		}

		Iterator<String> iterator = nomes.iterator(); // Testar a iteração do array.
		while (iterator.hasNext()) {
			System.out.println("----> " + iterator.next());
		}

		nomes.clear(); // Limpa a lista.
		listaVazia = nomes.isEmpty();
		System.out.println(listaVazia);

	}
}
