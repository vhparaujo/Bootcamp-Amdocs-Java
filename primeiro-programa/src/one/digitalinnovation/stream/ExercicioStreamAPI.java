package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.List;

public class ExercicioStreamAPI {

	public static void main(String[] args) {

		List<Jogador> jogadores = new ArrayList<>();

		jogadores.add(new Jogador("Neymar", 29));
		jogadores.add(new Jogador("Messi", 34));
		jogadores.add(new Jogador("CR7", 36));
		jogadores.add(new Jogador("Salah", 29));
		jogadores.add(new Jogador("Pedro", 19));
		jogadores.add(new Jogador("Endrick", 15));

		jogadores.stream().forEach(System.out::println);

		System.out.println("Contagem de jogares: " + jogadores.stream().count());

	}

}
