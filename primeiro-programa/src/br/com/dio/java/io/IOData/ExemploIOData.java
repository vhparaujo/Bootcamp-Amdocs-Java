package br.com.dio.java.io.IOData;

import java.io.*;
import java.util.Scanner;

/*
Crie um arquivo “peca-de-roupa.bin” e armazene:
1. Nome do produto, tamanho (P/M/G/U),quantidade e preço.
2. Leia este arquivo e imprima no console.
*/
public class ExemploIOData {

	public static void incluirProduto() throws IOException {
		File f = new File("/home/victor/Documentos/Bootcamp-Amdocs-Java/primeiro-programa/peca-de-roupa.bin");//utilizada para apontar arquivos ou diretórios.

		PrintStream ps = new PrintStream(System.out); //Criando um fluxo de saída para o console
		ps.flush(); //Descarregar no console

		/*
		 * OutputStream os = new FileOutputStream(f.getPath()); //criando um fluxo de armazenamento em um arquivo
		 * DataOutputStream dos = new DataOutputStream(os); //iniciando um objeto DataOutputStream
		 */
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

		Scanner scan = new Scanner(System.in); //abrindo teclado

		ps.print("Nome da peça de roupa: "); //Pedindo o nome do produto
		String nome = scan.nextLine(); //armazenando o input na variável
		dos.writeUTF(nome); //escrevendo no documento

		ps.print("Tamanho da peça (P/M/G/U): "); //Pedindo o tamanho do produto
		char tamanho = (char) System.in.read(); //armazenando o input na variável
		dos.writeChar(tamanho); //escrevendo no documento

		ps.print("Quantidade: "); //Pedindo a quantidade do produto
		int quant = scan.nextInt();
		dos.writeInt(quant);

		ps.print("Preço unitário: "); //Pedindo o preço do produto
		double preco = scan.nextDouble();
		dos.writeDouble(preco);

		ps.printf("O arquivo %s foi criado com %d bytes no diretório '%s'.\n", f.getName(), f.length(),
				f.getAbsolutePath()); //imprimindo frase formatada

		lerProduto(f.getPath()); //lendo o arquivo e exibindo no console

		scan.close(); //fechando o fluxo de entrada pelo teclado
	    dos.close(); //fechando o fluxo de escrita de dados primitivos no documento
	    ps.close(); //fechando o fluxo de escrita no console
	    
	}

	public static void lerProduto(String caminhoArquivo) throws IOException {
		
		File f = new File(caminhoArquivo); //utilizada para apontar arquivos ou diretórios.

		/*
		 * InputStream is = new FileInputStream(caminhoArquivo)); //abrindo um fluxo de leitura de um arquivo
		 * DataInputStream dis = new DataInputStream(is); //iniciando um objeto DataInputStream
		 */
		DataInputStream dis = new DataInputStream(new FileInputStream(caminhoArquivo));
		
		/*Um problema a ter em mente ao ler tipos de dados primitivos é que não há como distinguir um valor
        int válido de -1 do marcador de fim de fluxo normal. Isso basicamente significa que você não pode ver
        a partir do valor primitivo retornado se você atingiu o fim do fluxo.*/
		String nome = dis.readUTF(); //lendo a primeira linha do arquivo que contém uma String
		char tamanho = dis.readChar(); //lendo a terceira linha do arquivo que contém um char
		int quantidade = dis.readInt(); //lendo a segunda linha do arquivo que contém um número inteiro
		double preco = dis.readDouble(); //lendo a quarta linha do arquivo que contém um valor double

		System.out.printf("\nNome..................: %s\n", nome); 
		System.out.printf("Quantidade............: %d\n", quantidade);
		System.out.printf("Tamanho...............: %s\n", tamanho);
		System.out.printf("Preço.................: %f\n", preco);
		System.out.print("Total valor das peças: " + (quantidade * preco));

		dis.close(); //Fechando fluxo

	}

	public static void main(String[] args) throws IOException {

		incluirProduto();
	}

}
