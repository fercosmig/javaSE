/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.NumberComparation.java
 */
public class NumberComparation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numberOne, numberTwo;
		String result;
		
		numberOne = 1142;
		numberTwo = 123;
		result = getComparation(numberOne, numberTwo);
		System.out.println("Teste 01\n"+ result);
		
		numberOne = 13;
		numberTwo = 126;
		result = getComparation(numberOne, numberTwo);
		System.out.println("Teste 02\n"+ result);

		numberOne = 14;
		numberTwo = 12 + 2;
		result = getComparation(numberOne, numberTwo);
		System.out.println("Teste 03\n"+ result);
		
	}
	
	/**
	 * Crie um método que receba dois números e indique se são iguais ou se são
	 * diferentes. Mostre o maior e o menor (nesta sequência).
	 */
	public static String getComparation(Integer numberOne, Integer numberTwo) {

		String result = "";
		if (numberOne == numberTwo) {
			result += "Os números são iguais.";
		} else {
			result += "Os números são diferentes.\n";
			if (numberOne > numberTwo) {
				result += "Maior: " + numberOne + " Menor: " + numberTwo;
			} else {
				result += "Maior: " + numberTwo + " Menor: " + numberOne;
			}
		}
		return result;
	}

}
