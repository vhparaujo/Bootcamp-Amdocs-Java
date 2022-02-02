package one.digitalinnovation.comparators;
//Exercício final de comparators

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparators {

	public static void main(String[] args) {

		List<TimesDeFutebol> times = new ArrayList<>();

		times.add(new TimesDeFutebol("Liverpool", 6));
		times.add(new TimesDeFutebol("Porto", 2));
		times.add(new TimesDeFutebol("Olympique de Marsella", 1));
		times.add(new TimesDeFutebol("Milan", 7));
		times.add(new TimesDeFutebol("Steaua de Bucarest", 1));
		times.add(new TimesDeFutebol("Ajax", 4));
		times.add(new TimesDeFutebol("Inter de Milão", 3));
		times.add(new TimesDeFutebol("Benfica", 2));
		times.add(new TimesDeFutebol("Celtic", 1));
		times.add(new TimesDeFutebol("Nottingham Forest", 2));
		times.add(new TimesDeFutebol("Feyenoord", 1));
		times.add(new TimesDeFutebol("Manchester United", 3));
		times.add(new TimesDeFutebol("Aston Villa", 1));
		times.add(new TimesDeFutebol("Bayern de Munique", 6));
		times.add(new TimesDeFutebol("Chelsea", 2));
		times.add(new TimesDeFutebol("Real Madrid", 13));
		times.add(new TimesDeFutebol("PSV", 1));
		times.add(new TimesDeFutebol("Juventus", 2));
		times.add(new TimesDeFutebol("Estrela Vermelha", 1));
		times.add(new TimesDeFutebol("Hamburgo", 1));
		times.add(new TimesDeFutebol("Barcelona", 5));
		times.add(new TimesDeFutebol("Borussia ​Dortmund", 1));

		System.out.println("Todos os Campeões da Champions League!!");

		System.out.println("--- Ordem de inserção ---");
		System.out.println(times);

		System.out.println();
		times.sort(Comparator.comparingInt(TimesDeFutebol::getTitulosChampions));
		System.out.println("--- Ordem natural dos números --- (Method Reference) ");
		System.out.println(times);

		System.out.println();
		times.sort(Comparator.comparingInt(TimesDeFutebol::getTitulosChampions).reversed());
		System.out.println("--- Ordem reversa dos números --- (Method Reference) ");
		System.out.println(times);

		System.out.println();
		Collections.sort(times);
		System.out.println("--- Ordem natural dos números --- (Interface Comparable)");
		System.out.println(times);

		System.out.println();
		Collections.sort(times, new TimesOrdemReversa());
		System.out.println("--- Ordem reversa dos números --- (Interface Comparable)");
		System.out.println(times);

		System.out.println();
		times.sort((first, second) -> first.getTitulosChampions() - second.getTitulosChampions());
		System.out.println("--- Ordem natural dos números --- (Expressão Lambda)");
		System.out.println(times);

		System.out.println();
		times.sort((first, second) -> second.getTitulosChampions() - first.getTitulosChampions());
		System.out.println("--- Ordem reversa dos números --- (Expressão Lambda)");
		System.out.println(times);

	}

}
