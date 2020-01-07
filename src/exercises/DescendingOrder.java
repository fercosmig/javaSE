/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.DescendingOrder.java
 */
public class DescendingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 36;
		
		String result = getDescendingNumbers(number);

		System.out.println(result);
	}
	
	/**
	 * Crie um método que receba um número inteiro e imprima, em ordem decrescente,
	 * o valor do número até 0.
	 */
	public static String getDescendingNumbers(Integer number) {
		String result = "";
		for (int i = number; i >= 0; i--) {
			result += " | " + i;
		}
		return result;
	}

}
