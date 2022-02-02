package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Juliana");
		lista.add("Pedro");
		lista.add("Carlos");
		lista.add("Larissa");
		lista.add("João");

		System.out.println(lista);

		lista.set(2, "Roberto");
		System.out.println(lista);

		String nome = lista.get(1);

		lista.remove(4);
		System.out.println(lista);

		lista.remove("João");
		System.out.println(lista);

		int tamanho = lista.size();
		System.out.println(tamanho);

		Boolean temNome = lista.contains("Juliano");
		System.out.println(temNome);

		List<String> lista2 = new ArrayList<>();

		lista2.add("Ismael");
		lista2.add("Rodrigo");
		System.out.println(lista2);

		lista.addAll(lista2); // Adiciona os elementos da lista2 na lista.
		System.out.println(lista);

		Collections.sort(lista); // Ordena em ordem alfabética.
		System.out.println(lista);

		lista.isEmpty();
		System.out.println(lista.isEmpty());

	}

}