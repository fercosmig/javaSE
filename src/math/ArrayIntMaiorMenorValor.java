/**
 * 
 */
package math;

import java.util.Scanner;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.ArrayIntMaiorMenorValor.java
 */
public class ArrayIntMaiorMenorValor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maior = 0;
		int menor = 0;
		int quantidadeNumerosDigitados;
		int arrayValores[];
		Scanner scn = new Scanner(System.in);

		System.out.print("Quantos números deseja digitar: ");
		quantidadeNumerosDigitados = scn.nextInt();

		arrayValores = new int[quantidadeNumerosDigitados];

		for (int i = 0; i < quantidadeNumerosDigitados; i++) {
			System.out.print("Digite o " + (i + 1) + "° número dos " + quantidadeNumerosDigitados + ": ");
			arrayValores[i] = scn.nextInt();

			maior = arrayValores[i];
			menor = arrayValores[i];
		}
		for (int i = 0; i < quantidadeNumerosDigitados; i++) {
			if (arrayValores[i] > maior) {
				maior = arrayValores[i];
			} else if (arrayValores[i] < menor) {
				menor = arrayValores[i];
			}
		}
		System.out.println("O maior número é " + maior);
		System.out.println(("O menor número é " + menor));
	}

}
