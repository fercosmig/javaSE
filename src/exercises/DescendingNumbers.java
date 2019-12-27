/**
 * Crie uma classe java NumeroDecrescente que contenha um método que receba um número
 * inteiro e imprima, em ordem decrescente, o valor do número até 0.
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 27, 2019
 * @file exercises.DescendingNumbers.java
 */
public class DescendingNumbers {

	public static String getDescendingNumbers(Integer n) {
		String result = "";
		for (int i = n; i >= 0; i--) {
			result += " | " + i;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String result = getDescendingNumbers(12);
		System.out.println(result);
	}

}
