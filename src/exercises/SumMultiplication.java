/**
 * Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a
 * multiplicação dos números pares entre 0 e 30.
 */
package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 27, 2019
 * @file exercises.SumMultiplication.java
 */
public class SumMultiplication {
	private static final int NI = 0;
	private static final int NF = 30;

	public static void getSumMultiplication() {

		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int i = NI; i <= NF; i++) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}
		Long multiplication = (long) 1;
		for (Integer e : even) {
			if (e > 0) {
				multiplication = multiplication * e;
			}
		}
		Integer sum = 0;
		for (Integer o : odd) {
			sum = sum + o;
		}

		System.out.println(even.toString());
		System.out.println(odd.toString());
		System.out.println("Multiplicação dos números pares: " + multiplication);
		System.out.println("Soma dos números impares: " + sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getSumMultiplication();
	}

}
