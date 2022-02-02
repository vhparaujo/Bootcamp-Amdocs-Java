package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {

		Set<Double> notasAluno = new HashSet<>(); // Não mantém a ordem dos elementos.

		// Adiciona notas no set.
		notasAluno.add(5.8);
		notasAluno.add(6.4);
		notasAluno.add(5.1);
		notasAluno.add(3.2);
		notasAluno.add(8.6);
		notasAluno.add(9.7);

		System.out.println(notasAluno);

		// Remove a nota do set.
		notasAluno.remove(3.2);
		System.out.println(notasAluno);

		// Retorna quantidade de itens no set.
		System.out.println(notasAluno.size());

		// Navega em todos os itens do iterator.
		Iterator<Double> iterator = notasAluno.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		for (Double nota : notasAluno) {
			System.out.println(nota);
		}

		notasAluno.clear();
		System.out.println(notasAluno.isEmpty()); // Retorna se está vazio.
	}

}
