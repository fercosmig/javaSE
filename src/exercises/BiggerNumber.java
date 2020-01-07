/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.BiggerNumber.java
 */
public class BiggerNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numberOne, numberTwo, result;
		
		numberOne = 56;
		numberTwo = 24;
		result = getBiggerNumber(numberOne, numberTwo);
		System.out.println("numberOne: " + numberOne);
		System.out.println("numberTwo: " + numberTwo);
		System.out.println("Maior: " + result);
	}

	/**
	 * Crie um método que receba dois números inteiros e imprima o maior entre eles.
	 */
	public static Integer getBiggerNumber(Integer numberOne, Integer numberTwo) {
		Integer result = (numberOne > numberTwo ? numberOne : numberTwo);
		return result;
	}
}
