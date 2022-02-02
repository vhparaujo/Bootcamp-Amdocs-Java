package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class TesteVector {

	public static void main(String[] args) {

		List<String> esportes = new Vector<>();

		// Adiciona 4 esportes no vetor.
		esportes.add("Futebol");
		esportes.add("Tênis");
		esportes.add("Basquete");
		esportes.add("UFC");

		esportes.set(3, "Boxe"); // Altera a posição 3 do vetor.

		esportes.remove(2);
		esportes.remove("Boxe");

		System.out.println(esportes.get(0));

		for (String esporte : esportes) {
			System.out.println(esporte);

		}

	}

}
