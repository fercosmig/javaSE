/**
 * 
 */
package math;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.PrimeNumbers.java
 */
public class PrimeNumbers {

	public static String listPrimeNumbers(Integer qtd) {

		String retorno = "";
		int counter;
		int number = 0;
		for (int i = 0; i <= qtd; i++) {
			counter = 0;
			for (int u = 1; u <= i; u++) {
				if (i % u == 0) {
					counter++;
					number = u;
				}
			}
			if (counter == 2) {
				retorno += " | " + number;
			}
		}
		return retorno;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista = listPrimeNumbers(30);
		System.out.println(lista);
	}

}
