/**
 * 
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

		System.out.println("Array bidimencional. Matriz.");

		String[][] carros = { { "fiat", "palio" }, { "fiat", "Strada" }, { "ford", "ka" } };

		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i][0] + " :: " + carros[i][1]);
		}

		getSeparator();

		System.out.println("Array de Strings.");

		String[] nomes = { "Fernando", "Jurandir", "Maria Celina", "Cintia", "Alessandra", "Fernanda" };

		// Imprime os elementos do array.
		for (String n : nomes) {
			System.out.println(n);
		}

		getSeparator();

		System.out.println("Array de Strings. Outra forma de utilização.");

		String[] nomes1;
		nomes1 = new String[6];
		nomes1[0] = "Fernando";
		nomes1[1] = "Jurandir";
		nomes1[2] = "Maria Celina";
		nomes1[3] = "Cintia";
		nomes1[4] = "Alessandra";
		nomes1[5] = "Fernanda";

		// Imprime os elementos do array.
		for (String n : nomes1) {
			System.out.println(n);
		}

		getSeparator();

		System.out.println("List - ArrayList<String>.");

		List<String> nomes2 = new ArrayList<String>();

		nomes2.add("Fernando");
		nomes2.add("Jurandir");
		nomes2.add("Maria Celina");
		nomes2.add("Cintia");
		nomes2.add("Alessandra");
		nomes2.add("Fernanda");

		System.out.println(nomes2.toString());
		Collections.sort(nomes2);
		System.out.println(nomes2.toString());

		getSeparator();

		System.out.println("Array de inteiros.");
		
		int[] numeros = { 8, 2, 7, 9, 3, 6, 4, 0, 5, 1 };

		for (int n : numeros) {
			System.out.print(n + " | ");
		}
		System.out.println();

		numeros = getArraySorted(numeros);
		for (int x : numeros) {
			System.out.print(x + " | ");
		}
	}

	public static void getSeparator() {
		String separator = "\n# ";
		for (int i = 0; i < 80; i++) {
			separator += "-";
		}
		separator += " #\n";
		System.out.println(separator);
	}

	public static int[] getArraySorted(int[] array) {

		int aux;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}

		return array;
	}

}
