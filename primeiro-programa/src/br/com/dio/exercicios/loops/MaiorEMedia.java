package br.com.dio.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado

		// variáveis
		double maior = 0; // guarda o maior número
		double soma = 0; // guarda a soma
		double media; // guarda a média
		
		int count = 0; // controla o loop
		// loop
		
		System.out.println("Digite a quantidade de números que você deseja imprimir: ");
		int quantVezes = scan.nextInt(); //Define a quantidade de vezes que se pretende imprimir os números.

		do {
			System.out.println("Número: "); // Peça um número
			double numero = scan.nextDouble(); // Entrada de dados, neste caso de um Double.

			if (numero > maior) { // Caso o valor que o usuário digitou seja maior que o valor armazenado na
									// variável maior.
				maior = numero; // atribua o valor deste número a variável maior.
			}

			soma = soma + numero; // some o número informado pelo usuário com variável soma (independente do
									// valor)

			count = count + 1; // some o valor 1 ao contador, até que invalide a condição do loop. (count < quantVezes)
		} while (count < quantVezes); // enquanto o contador tiver o valor menor que a quantidade de vezes.

		media = soma / quantVezes; // faça o cálculo da média. (soma/quantVezes)

		// imprimindo o maior número digtados e a média dos mesmos
		System.out.println("Maior: " + maior + " - Média: " + media);
		
	}
}
