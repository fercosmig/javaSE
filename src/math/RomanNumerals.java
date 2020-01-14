/**
 * 
 */
package math;

import java.util.Scanner;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 13, 2020
 * @file math.RomanNumerals.java
 */
public class RomanNumerals {

	/**
	 * 
	 */
	public RomanNumerals() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		System.out.print("Digite um numero: ");
		int number = s.nextInt();

		while (true) {

			if (number == 0) {
				break;
			}

			System.out.print(number + " - ");

			int i = 0;
			while (number > 0) {
				if (number >= numbers[i]) {
					System.out.print(romans[i]);
					number -= numbers[i];
				} else {
					i++;
				}

			}
		}
	}

}
