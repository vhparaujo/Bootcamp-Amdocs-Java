package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Consoantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

		String[] consoantes = new String[6]; //iniciando um arrays vazio com 6 posições
		int quantidadeConsoantes = 0;

		int count = 0; //controla o loop
		do {
			System.out.println("Letra: "); //Peça uma letra 
			String letra = scan.next(); //capture essa letra e atrubua a variável letra.

			//se a letra informada não seja igual a a, e, i, o ou u
			if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
					| letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u") ) ) {
				 //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
				consoantes[count] = letra;
				quantidadeConsoantes++;
			}

			count++; //acrescente o valor 1 ao contador a cada loop

		} while (count < consoantes.length); //enquanto o contador tiver o valor menor que o tamanho do array

		System.out.print("Consoantes: "); //frase ilustrativa
		for (String consoante : consoantes) { //para cada consoante dentro do array consoantes
			if (consoante != null) //se o valor da consoante for diferente de null
				System.out.print(consoante + " "); //imprima a consoante
		}
		System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
		
	}
}
