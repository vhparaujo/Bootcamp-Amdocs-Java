package one.digitalinnovation.comparators;
//Exercício final de comparators

public class TimesDeFutebol implements Comparable<TimesDeFutebol> {

	private final String time;
	private final Integer titulosChampions;

	public TimesDeFutebol(String time, Integer titulosChampions) {
		this.time = time;
		this.titulosChampions = titulosChampions;
	}

	public String getTime() {
		return time;
	}

	public Integer getTitulosChampions() {
		return titulosChampions;
	}

	@Override
	public String toString() {
		return time + " -- " + titulosChampions;
	}

	@Override
	public int compareTo(TimesDeFutebol o) {
		return this.getTitulosChampions() - o.getTitulosChampions();
	}

}
