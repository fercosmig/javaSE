/**
 * Crie uma classe java MaiorNumero que contenha um método que receba
 * dois números inteiros e imprima o maior entre eles.
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 27, 2019
 * @file exercises.BiggerNumber.java
 */
public class BiggerNumber {

	public static Integer getBiggerNumber(Integer a, Integer b) {
		Integer result = (a > b ? a : b);
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n = getBiggerNumber(18, 18);
		System.out.println(n);

	}

}
