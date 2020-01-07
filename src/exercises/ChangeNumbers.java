/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.ChangeNumbers.java
 */
public class ChangeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numberOne, numberTwo;
		String result;

		numberOne = 34;
		numberTwo = 56;

		result = getChangedNumbers(numberOne, numberTwo);

		System.out.println(result);
	}

	/**
	 * Crie um método que receba dois números NumA e NumB, nessa ordem, e imprima em
	 * ordem inversa, isto é, se os dados lidos forem NumA = 5 e NumB = 9, por
	 * exemplo, devem ser impressos na ordem NumA = 9 e NumB = 5.
	 */
	public static String getChangedNumbers(Integer numberOne, Integer numberTwo) {

		String result = "numberOne = " + numberOne + "\n";
		result += "numberTwo = " + numberTwo + "\n";
		result += "...fazendo a troca...\n";

		Integer aux;
		aux = numberOne;
		numberOne = numberTwo;
		numberTwo = aux;

		result += "numberOne = " + numberOne + "\n";
		result += "numberTwo = " + numberTwo;

		return result;
	}

}
