/**
 * 
 */
package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file random.Loteria.java
 */
public class Loteria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Loteria loteria = new Loteria();
		
		/**
		 * LOTOFÁCIL
		 * 25 dezenas na cartela
		 * 15 dezenas para sortear
		 * 6 jogos
		 */
		System.out.println("LOTOFÁCIL");
		loteria.getSorteio(25, 15, 6);

		/**
		 * MEGASENA
		 * 60 dezenas na cartela
		 * 6 dezenas para sortear
		 * 6 jogos
		 */
		System.out.println("MEGASENA");
		loteria.getSorteio(60, 6, 6);

		/**
		 * QUINA
		 * 80 dezenas na cartela
		 * 5 dezenas para sortear
		 * 6 jogos
		 */
		System.out.println("QUINA");
		loteria.getSorteio(80, 5, 6);

		/**
		 * LOTOMANIA
		 * 100 dezenas na cartela
		 * 50 dezenas para sortear
		 * 6 jogos
		 */
		System.out.println("LOTOMANIA");
		loteria.getSorteio(100, 50, 6);

	}
	
	public void getSorteio(int totalDezenas, int QuantidadeDezenasSortear, int QuantidadeJogos) {

		List<Integer> dezenas = new ArrayList<Integer>();
		List<Integer> sorteados;

		for (int i = 0; i < totalDezenas; i++) {
			dezenas.add(i + 1);
		}

		for (int k = 0; k < QuantidadeJogos; k++) {
			Collections.shuffle(dezenas);
			sorteados = new ArrayList<Integer>();
			for (int j = 0; j < QuantidadeDezenasSortear; j++) {
				sorteados.add(dezenas.get(j));
			}
			
			Collections.sort(sorteados);
			System.out.println("JOGO " + (k + 1) + ": " + sorteados.toString());
		}
	}

}
