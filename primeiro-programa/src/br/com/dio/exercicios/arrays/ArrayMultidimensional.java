package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();

		int[][] matriz = new int[4][4];

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		for (int[] linha : matriz) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
		
		//int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
		//System.out.print(numeros[2][2]);
		
		/*
		int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
        */
	}
}
