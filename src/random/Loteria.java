/**
 * 
 */
package random;

import java.util.ArrayList;
import java.util.List;

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
	}

	/**
	 * Methods
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		sorteiaComparaMetodosVariosJogos();
		getJogos(10, "LOTOFACIL");

	}

	/**
	 * @param qtdJogos
	 * @param jogo
	 */
	public static void getJogos(int qtdJogos, String jogo) {

		RaffleDifferentNumbers rdf = new RaffleDifferentNumbers();
		Integer qtd = 0;
		Integer max = 0;
		List<Integer> result = new ArrayList<Integer>();

		switch (jogo) {
		case "LOTOFACIL":
			qtd = 15;
			max = 25;
			break;
		case "LOTOMANIA":
			qtd = 50;
			max = 100;
			break;
		case "MEGASENA":
			qtd = 6;
			max = 60;
			break;
		case "QUINA":
			qtd = 5;
			max = 80;
			break;
		default:
			break;
		}

		for (int i = 0; i < qtdJogos; i++) {

			result = rdf.getRaffleNumbersWithRandom(qtd, max);
			System.out.println(jogo + " " + (i + 1) + ": " + result.toString());
		}
	}

	public static void sorteiaComparaMetodosVariosJogos() {

		RaffleDifferentNumbers rdf = new RaffleDifferentNumbers();
		Integer qtd, max;
		List<Integer> sorteioCollections = new ArrayList<Integer>();
		List<Integer> sorteioRandom = new ArrayList<Integer>();

		// LOTOFÁCIL
		qtd = 15;
		max = 25;
		sorteioCollections = rdf.getRaffleNumbersWithCollections(qtd, max);
		sorteioRandom = rdf.getRaffleNumbersWithRandom(qtd, max);

		System.out.println("LOTOFÁCIL");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());

		// MEGASENA
		qtd = 6;
		max = 60;
		sorteioCollections = rdf.getRaffleNumbersWithCollections(qtd, max);
		sorteioRandom = rdf.getRaffleNumbersWithRandom(qtd, max);

		System.out.println("MEGASENA");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());

		// QUINA
		qtd = 5;
		max = 80;
		sorteioCollections = rdf.getRaffleNumbersWithCollections(qtd, max);
		sorteioRandom = rdf.getRaffleNumbersWithRandom(qtd, max);

		System.out.println("QUINA");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());

		// LOTOMANIA
		qtd = 50;
		max = 100;
		sorteioCollections = rdf.getRaffleNumbersWithCollections(qtd, max);
		sorteioRandom = rdf.getRaffleNumbersWithRandom(qtd, max);

		System.out.println("LOTOMANIA");
		System.out.println("Collections: " + sorteioCollections.toString());
		System.out.println("Random     : " + sorteioRandom.toString());
	}

}
