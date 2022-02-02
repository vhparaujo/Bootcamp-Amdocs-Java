package one.digitalinnovation.comparators;

import java.util.Comparator;

public class EstudanteIdadeReversa implements Comparator<Estudante> {

	@Override
	public int compare(Estudante o1, Estudante o2) {
		return o2.getIdade() - o1.getIdade();
	}

}