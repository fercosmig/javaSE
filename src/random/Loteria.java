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
 * @since Dec 24, 2019
 * @file random.Loteria.java
 */
public class Loteria {

	/**
	 * Constructors
	 */
	public Loteria() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Methods
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Loteria loteria = new Loteria();
		Integer qtd, max; 
		List<Integer> sorteioCollections = new ArrayList<Integer>();
		List<Integer> sorteioRandom = new ArrayList<Integer>();


		// LOTOFÁCIL
		qtd = 15;
		max = 25;
		sorteioCollections = loteria.getSorteioCollections(qtd, max);
		sorteioRandom = loteria.getSorteioRandom(qtd, max);

		System.out.println("LOTOFÁCIL");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());

		// MEGASENA
		qtd = 6;
		max = 60;
		sorteioCollections = loteria.getSorteioCollections(qtd, max);
		sorteioRandom = loteria.getSorteioRandom(qtd, max);

		System.out.println("MEGASENA");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());

		// QUINA
		qtd = 5;
		max = 80;
		sorteioCollections = loteria.getSorteioCollections(qtd, max);
		sorteioRandom = loteria.getSorteioRandom(qtd, max);

		System.out.println("QUINA");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());

		// LOTOMANIA
		qtd = 50;
		max = 100;
		sorteioCollections = loteria.getSorteioCollections(qtd, max);
		sorteioRandom = loteria.getSorteioRandom(qtd, max);

		System.out.println("LOTOMANIA");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());
	}

	public List<Integer> getSorteioCollections(int quantity, int max) {

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

	public List<Integer> getSorteioRandom(int quantity, int max) {

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

}
