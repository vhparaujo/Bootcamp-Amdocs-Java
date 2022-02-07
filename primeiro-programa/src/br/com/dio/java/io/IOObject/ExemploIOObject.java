package br.com.dio.java.io.IOObject;

import java.io.*;

//Crie a classe Gato com os atributos nome, idade e cor:
//Instancie um objeto e serialize
//Desserialize este objeto e mostre no console
public class ExemploIOObject {

	public static void serealizacao() throws IOException {
		Gato gato = new Gato("Teddy", 7, "laranjado", true, false); // Instanciação do objeto gato

		File f = new File("gato"); // representação do documento

//      OutputStream os = new FileOutputStream(f.getName()); // criando um fluxo de armazenamento em um arquivo
//      ObjectOutputStream oos = new ObjectOutputStream(os); // iniciando um objeto ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName())); // criar arquivo

		oos.writeObject(gato); // iniciando um objeto DataOutputStream

		System.out.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

		oos.close(); // Fechando fluxo
	}

	public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {
		/*
		 * InputStream is = new FileInputStream(arquivo); ObjectInputStream ois = new
		 * ObjectInputStream(is);
		 */
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo)); // Abrir e iniciar fluxo de leitura
																						// de dados
		Gato objetoGato = (Gato) ois.readObject(); // método que lê o objeto serealizado

		// imprima no console:
		System.out.printf("\nNome..................: %s\n", objetoGato.getNome());
		System.out.printf("Ronrona................: %s\n", objetoGato.isRonrona());
		System.out.printf("Idade...................: %d\n", objetoGato.getIdade());
		System.out.printf("Cor.....................: %s\n", objetoGato.getCor());
		System.out.printf("Castrado................: %s\n", objetoGato.isCastrado());
		System.out.printf("Ronrona................: %s\n", objetoGato.isRonrona());
		// System.out.println(objetoGato);

		ois.close(); // fechar o arquivo

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		serealizacao();
		desserializacao("/home/victor/Documentos/Bootcamp-Amdocs-Java/primeiro-programa/gato");
	}
}
