package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		TreeSet<String> treeCapitais = new TreeSet<>();

		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Brasília");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Goiânia");
		treeCapitais.add("Belém");

		System.out.println(treeCapitais);

		// Retorna a primeira capital no topo da árvore.
		System.out.println(treeCapitais.first());

		// Retorna a última capital no final da árvore.
		System.out.println(treeCapitais.last());

		// Retorna a primeira capital abaixo na árvore da capital parametrizada.
		System.out.println(treeCapitais.lower("Goiânia"));

		// Retorna a primeira capital acima na árvore da capital parametrizada.
		System.out.println(treeCapitais.higher("Goiânia"));

		System.out.println(treeCapitais);

		// Retorna a primeira capital no topo da árvore, removendo do set.
		System.out.println(treeCapitais.pollFirst());

		// Retorna a primeira capital no final da árvore, removendo do set.
		System.out.println(treeCapitais.pollLast());

		System.out.println(treeCapitais);

		// Navega em todos os itens do iterator.
		Iterator<String> iterator = treeCapitais.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		System.out.println();
		for (String nota : treeCapitais) {
			System.out.println(nota);
		}

	}

}
