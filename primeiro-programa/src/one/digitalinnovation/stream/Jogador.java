package one.digitalinnovation.stream;

public class Jogador implements Comparable<Jogador> {

	private final String nome;
	private final Integer idade;

	public Jogador(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return nome + " -- " + idade;
	}

	@Override
	public int compareTo(Jogador o) {
		return this.getIdade() - o.getIdade();
	}

}
