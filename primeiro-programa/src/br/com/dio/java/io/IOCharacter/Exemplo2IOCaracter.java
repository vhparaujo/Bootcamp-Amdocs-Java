package br.com.dio.java.io.IOCharacter;

import java.io.*;
import java.util.Scanner;

//Abra o teclado para escrever 3 filmes,séries, desenhos e/ou animes que você recomendaria e armazene em “recomendacoes.txt”.
public class Exemplo2IOCaracter {

	public static void lerTecladoEscreverDoc() throws IOException {

		PrintWriter pw = new PrintWriter(System.out); // impressão no console
		pw.println("Digite 3 recomendações de filmes, séries, desenhos e/ou animes: ");// mensagem que será exibida no console
		pw.flush();// descarregue a conteúdo do método write no console

		Scanner scan = new Scanner(System.in); // abertura do teclado

		File f = new File("recomendacoes.txt"); // classe utilizada para especificar arquivos ou diretórios.

		BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName())); // criando o documento recomendacoes.txt

		String line = scan.nextLine(); // captura a linha do teclado
		do {
			bw.write(line);// escreva no buffer interno a linha capturada pelo scanner
			bw.newLine();// pule para próxima linha no buffer
			bw.flush();
			line = scan.nextLine();// pegue a proxima linha do teclado
		} while (!(line.equalsIgnoreCase("fim")));// repita as operações do laço do-while. Quando digitar a palavra
													// 'fim', pare.

		pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());
		// utilizando o método printf da classe PrintWrite para formatar a mensagem que
		// será exibida no console.
		// pw.flush(); //(neste caso não precisaria do método flush já que em seguida
		// fechamos o fluxo: pw.close())

		pw.close();// fechamos o fluxo de saída para o console
		scan.close();// fechamos o fluxo de entrada através do teclado
		bw.close();// fechamos o fluxo de saída para escrita no documento

	}

	public static void main(String[] args) throws IOException {
		lerTecladoEscreverDoc();
	}

}
