package br.com.dio.java.io.IOBytes;

import java.io.*;

//Faça uma cópia do arquivo “recomendacoes-copy.txt”.
public class ExemploIOBytes {
	public static void copiarArquivo() throws IOException {
		
		File f = new File("/home/Documentos/Bootcamp-Amdocs-Java/primeiro-programa/recomendacoes-copy.txt"); //classe utilizada para especificar arquivos ou diretórios
		String nomeArquivo = f.getName(); //método para recuperar o nome do arquivo ou diretório
		
		//abrindo arquivo que será copiado
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo)); 
		//padrão decorator -> Fluxo de entrada que lê de um arquivo + Fluxo de entrada que armazena em um buffer
		
		String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");//preparando o nome do novo arquivo cópia.
		
		File fCopy = new File(nomeArquivoCopy);//classe utilizada para especificar arquivos ou diretórios
		
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy)); 
        //padrão decorator -> Fluxo de saída que grava em um arquivo + Fluxo de saída armazenada em um buffer

		int line = 0;
		while ((line = bis.read()) != -1) {
			bos.write((char) line);
			//bos.flush();
		}

		bis.close();
		bos.close();

		System.out.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes ", fCopy.getName(), fCopy.getPath(), fCopy.length());

	}

	public static void main(String[] args) throws IOException {
		copiarArquivo();
	}

}
