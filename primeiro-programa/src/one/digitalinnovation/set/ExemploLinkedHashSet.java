package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> sequenciaNumeros = new LinkedHashSet<>();

		// Adiciona os números no set.
		sequenciaNumeros.add(15);
		sequenciaNumeros.add(5);
		sequenciaNumeros.add(10);
		sequenciaNumeros.add(8);
		sequenciaNumeros.add(4);

		System.out.println(sequenciaNumeros);

		// Remove um numero do set.
		sequenciaNumeros.remove(3.2);
		System.out.println(sequenciaNumeros);

		// Retorna quantidade de itens no set.
		System.out.println(sequenciaNumeros.size());

		// Navega em todos os itens do iterator.
		Iterator<Integer> iterator = sequenciaNumeros.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		for (Integer nota : sequenciaNumeros) {
			System.out.println(nota);
		}

		sequenciaNumeros.clear();
		System.out.println(sequenciaNumeros.isEmpty()); // Retorna se está vazio.
	}

}
