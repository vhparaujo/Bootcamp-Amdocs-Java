package br.com.dio.exercicios.arrays;

public class OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = { -5, -6, 15, 50, 8, 4 }; //inicializando um vetor com 5 elementos.

		// System.out.println(vetor.length);

		System.out.print("Vetor: ");
		int count = 0;
		while (count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}

		System.out.print("\nVetor Inverso: ");
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}
}
