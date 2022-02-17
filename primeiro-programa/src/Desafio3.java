import java.io.*;
import java.util.Scanner;

public class Desafio3 {

	public static void dados() throws IOException {
		Scanner leitor = new Scanner(System.in);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		System.out.println("Você acha que seu colchão passará pela porta? ");
		String line = leitor.nextLine();

		System.out.println("Escreve altura do colchão: ");
		int B = leitor.nextInt(); // Altura
		bw.write(B);
		System.out.println("Escreve largura do colchão: ");
		int C = leitor.nextInt(); // Largura
		bw.write(C);
		System.out.println("Escreve altura da porta: ");
		int H = leitor.nextInt(); // Altura porta
		bw.write(H);
		System.out.println("Escreve largura da porta: ");
		int L = leitor.nextInt(); // Largura porta
		bw.write(L);

		if (H > B || L > C) {
			System.out.println("Seu colchão passará pela porta!!");
		} else {
			System.out.println("Seu colchão não passará pela porta!!");
		}

	}

	public static void main(String[] args) throws IOException {
		dados();
	}

}
