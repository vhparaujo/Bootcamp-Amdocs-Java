package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class ComparatorsExemploList {

	public static void main(String[] args) {

		List<Estudante> estudantes = new ArrayList<>();

		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));

		System.out.println("--- Ordem de inserção ---");
		System.out.println(estudantes);

		System.out.println();
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
		System.out.println("--- Ordem natural dos números --- (Expressão Lambda)");
		System.out.println(estudantes);

		System.out.println();
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println("--- Ordem reversa dos números --- (Expressão Lambda)");
		System.out.println(estudantes);

		System.out.println();
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		System.out.println("--- Ordem natural dos números --- (Method Reference) ");
		System.out.println(estudantes);

		System.out.println();
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		System.out.println("--- Ordem reversa dos números --- (Method Reference) ");
		System.out.println(estudantes);

		System.out.println();
		Collections.sort(estudantes);
		System.out.println("--- Ordem natural dos números --- (Interface Comparable)");
		System.out.println(estudantes);

		System.out.println();
		Collections.sort(estudantes, new EstudanteIdadeReversa());
		System.out.println("--- Ordem reversa dos números --- (Interface Comparable)");
		System.out.println(estudantes);
	}

}
