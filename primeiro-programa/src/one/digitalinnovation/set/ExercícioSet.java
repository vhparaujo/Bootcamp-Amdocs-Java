package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercícioSet {

	public static void main(String[] args) {

		// Testa o HashSet.
		Set<Integer> numerosInteiros = new HashSet<>();

		numerosInteiros.add(3);
		numerosInteiros.add(88);
		numerosInteiros.add(20);
		numerosInteiros.add(44);
		numerosInteiros.add(3);

		System.out.println("HashSet: " + numerosInteiros);

		numerosInteiros.remove(3);
		System.out.println("Remove o primeiro elemento " + numerosInteiros);

		numerosInteiros.add(23);
		System.out.println("HashSet: " + numerosInteiros);

		System.out.println(numerosInteiros.size());

		System.out.println(numerosInteiros.isEmpty());

		// Testa o LinkedHashSet.
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);

		System.out.println("LinkedHashSet: " + numeros);

		numerosInteiros.remove(3);
		System.out.println("Remove o primeiro elemento " + numerosInteiros);

		numerosInteiros.add(23);
		System.out.println("LinkedHashSet: " + numerosInteiros);

		System.out.println(numeros.size());

		System.out.println(numeros.isEmpty());

		// Testa o TreeSet.
		TreeSet<Integer> numerosI = new TreeSet<>();

		numerosI.add(3);
		numerosI.add(88);
		numerosI.add(20);
		numerosI.add(44);
		numerosI.add(3);

		System.out.println("TreeSet: " + numerosI);

		numerosInteiros.remove(3);
		System.out.println("Remove o primeiro elemento " + numerosInteiros);

		numerosInteiros.add(23);
		System.out.println("TreeSet: " + numerosInteiros);

		System.out.println(numerosI.size());

		System.out.println(numerosI.isEmpty());

	}

}
