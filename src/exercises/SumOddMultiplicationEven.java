/**
 * 
 */
package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.SumOddMultiplicationEven.java
 */
public class SumOddMultiplicationEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String result = getSumMultiplication();
		
		System.out.println(result);
		
	}

	/**
	 * Escreva um método que imprima na tela a soma dos números ímpares entre 0 e 30
	 * e a multiplicação dos números pares entre 0 e 30.
	 */
	public static String getSumMultiplication() {
		int startNumber = 0;
		int endNumber = 30;
		String result;

		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int i = startNumber; i <= endNumber; i++) {
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

		result = even.toString() + "\n";
		result += odd.toString()+"\n\n";
		result += "Multiplicação dos números pares: " + multiplication + "\n";
		result += "Soma dos números impares: " + sum;
		
		return result;
	}
}
