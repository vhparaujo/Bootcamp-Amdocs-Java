package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeirosPassos {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
	}
	
}

class Livros {
	private String nome;
	private String npag;
	
}