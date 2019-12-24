/**
 * 
 */
package array;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file array.ArrayTest.java
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nomes = { "Fernando", "Fernanda", "Jurandir", "Maria Celina", "Cintia", "Alessandra" };
		System.out.println(nomes[3]);
		for (String s : nomes) {
			System.out.println(s);
		}

		String[][] carros = { { "fiat", "palio" }, { "fiat", "Strada" }, { "ford", "ka" } };

		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i][0] + " :: " + carros[i][1]);
		}
	}

}
