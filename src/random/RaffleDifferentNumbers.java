/**
 * 
 */
package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 31, 2019
 * @file random.RaffleDifferentNumbers.java
 */
public class RaffleDifferentNumbers {

	/**
	 * Constructors
	 */
	public RaffleDifferentNumbers() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Methods
	 */

	public List<Integer> getRaffleNumbersWithRandom(int quantity, int max) {

		Random rnd = new Random();

		int i = 0;
		int number = 0;
		Boolean repeated = false;
		List<Integer> numbers = new ArrayList<Integer>();
		// numbers.add(0);

		while (i < quantity) {

			number = (rnd.nextInt(max) + 1);

			for (Integer n : numbers) {
				if (n == number) {
					repeated = true;
				}
			}

			if (!repeated) {
				numbers.add(number);
				i++;
			}

			repeated = false;
		}

		Collections.sort(numbers);
		return numbers;
	}

	public List<Integer> getRaffleNumbersWithCollections(int quantity, int max) {

		List<Integer> dezenas = new ArrayList<Integer>();

		for (int i = 0; i < max; i++) {
			dezenas.add(i + 1);
		}
		Collections.shuffle(dezenas);

		List<Integer> sorteados = new ArrayList<Integer>();

		for (int j = 0; j < quantity; j++) {
			sorteados.add(dezenas.get(j));

		}
		Collections.sort(sorteados);
		return sorteados;
	}

}
