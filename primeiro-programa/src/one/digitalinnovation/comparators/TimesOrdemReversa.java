package one.digitalinnovation.comparators;
//Exercício final de comparators

import java.util.Comparator;

public class TimesOrdemReversa implements Comparator<TimesDeFutebol> {

	@Override
	public int compare(TimesDeFutebol o1, TimesDeFutebol o2) {
		return o2.getTitulosChampions() - o1.getTitulosChampions();
	}

}
