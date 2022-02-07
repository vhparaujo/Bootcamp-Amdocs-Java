package br.com.dio.java.io.IOCharacter;

import java.io.*;

//Faça uma cópia do arquivo “recomendacoes.txt” e agora adicione 3 recomendações de livros.
public class Exemplo3IOCaracter {
	public static void copiarArquivo() throws IOException {
		// criando uma referência para o arquivo que será copiado
		File f = new File("/home/Documentos/Bootcamp-Amdocs-Java/primeiro-programa/recomendacoes.txt");
		String nameArquivo = f.getName(); // nome do arquivo original

		/*
		 * FileReader r = new FileReader(nameArquivo); BufferedReader br = new
		 * BufferedReader(r);
		 */
		BufferedReader br = new BufferedReader(new FileReader(nameArquivo)); // abrir arquivo que será copiado

		// formatando o nome do arquivo de copia
		/*
		 * 1. tirando a extensão .txt do nome do arquivo original. 2. acrescentando
		 * -copy.txt ao nome do arquivo que será armazenado a copia
		 */
		String nameArquivoCopy = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("-copy.txt");

		File fCopy = new File(nameArquivoCopy); // criando uma referência para o copia arquivo

		BufferedWriter bw = new BufferedWriter(new FileWriter(fCopy.getName())); // criando o arquivo copia

		String line = br.readLine(); // lendo as linhas do arquivo que será copiado
		do {
			bw.write(line); // pegue a linha lida no arquivo original "recomendacoes.txt" e armazene no
							// buffer
			bw.newLine();// depois insira uma linha
			bw.flush();// descarrege as informações capturadas no teclado no arquivo recomendacoes.txt
			line = br.readLine();// depois de realizado a cópia da linha acima, preenchemos a linha novamente
		} while (!(line == null));// enquanto a linha for diferente de null, continue copiando.

		 //mensagem formatada que será exibida no console
		System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", f.getName(), f.length());
		System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho '%d' bytes.\n", fCopy.getName(),fCopy.length());
		System.out.printf("Arquivo '%s' criado no diretório: '%s' \n", fCopy.getName(),
				fCopy.getAbsolutePath());

		br.close(); //fechamos o fluxo de entrada
		bw.close(); //fechamos o fluxo de saída para escrita no documento
		
		System.out.println("Agora recomende 3 livros: ");
		
		adicionarInfos(fCopy.getName()); //executando o método
		
		System.out.printf("Ok! Tudo certo. Tamanho do arquivo %d bytes" , fCopy.length());//mensagem formatada no console
		
	}
	
	public static void adicionarInfos(String arquivoCopy) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//padrão decorator para ler (input) do teclado.

		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCopy, true));
	    //padrão decorator para escrever (output) no arquivo sem apagar o conteúdo que já existia.

		String line = br.readLine();
		
		do { //faça
            bw.write(line); //escreva no buffer interno a linha capturada pelo scanner
            bw.newLine(); //pule para próxima linha no buffer
            line = br.readLine(); //pegue a proxima linha do teclado
        } while(!line.equalsIgnoreCase("fim"));
		//repita as operações do laço do-while. Quando digitar a palavra 'fim', pare.
		
        //fechando todos os fluxos
        br.close(); //fechamos o fluxo de entrada
        bw.close(); //fechamos o fluxo de saída para escrita no documento
		
	}
	
	public static void main(String[] args) throws IOException {
		copiarArquivo();
	}

}
