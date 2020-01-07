/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.LeapYear.java
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean result;
		for (int i = 1970; i < 2080; i++) {
			result = isLeap(i);
			if (result) {
				System.out.println(i + " é bissexto.");
			} else {
				System.out.println(i + " não é bissexto.");
			}
		}
	}

	/**
	 * Crie um método que receba um ano e retorne se o mesmo é ou não bissexto.
	 */

	public static boolean isLeap(Integer year) {

		/**
		 * Divisivel por 400 = bissexto.
		 * Divisível por 4, mas não por 100 = bissexto.
		 */

		double testOne, testTwo, testTree;
		boolean leap = false;

		testOne = year % 4;
		testTwo = year % 100;
		testTree = year % 400;

		if ((testTree == 0) || (testOne == 0 && testTwo > 0)) {
			leap = true;
		}
		return leap;
	}

}
