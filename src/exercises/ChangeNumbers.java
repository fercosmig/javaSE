/**
 * Crie uma classe java TrocaNumero que contenha um método que receba dois
 * números NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os
 * dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na
 * ordem NumA = 9 e NumB = 5.
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 27, 2019
 * @file exercises.ChangeNumbers.java
 */
public class ChangeNumbers {

	public static String getChangedNumbers(Integer numA, Integer numB) {

		String result = "Numero recebido na variavel numA = " + numA + "\n";
		result += "Numero recebido na variavel numB = " + numB + "\n";
		result += "...faxendo a troca...\n";

		Integer aux;
		aux = numA;
		numA = numB;
		numB = aux;

		result += "Numero em numA = " + numA + "\n";
		result += "Numero em numB = " + numB;

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String result = getChangedNumbers(12, 34);
		System.out.println(result);
	}

}
