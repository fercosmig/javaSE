/**
 * 
 */
package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file random.Sorteio.java
 */
public class Sorteio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Instanciando o objeto que gera os numeros randomicos.
		 */
		Random rnd = new Random();

		/**
		 * Passando o valor 200 o método vai sorte valores entre 0 e 199. Soma-se 1 (+
		 * 1) para obter um valor entre 1 e 200.
		 */
		Integer numeroSorteado = rnd.nextInt(200) + 1;

		/**
		 * Criando o título e o texto da mensagem, e já adicionando o número sorteado a
		 * mensagem.
		 */
		String title = "CARRO COM TUDO";
		String message = "O número sorteado foi: " + numeroSorteado;

		/**
		 * Exibindo o número sorteado.
		 */
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);

		/**
		 * 
		 * Testes / Exemplos
		 * 
		 */

		for (int x = 0; x < 15; x++) {

			List<Integer> numeros = new ArrayList<Integer>();
			for (int i = 0; i < 20; i++) {
				numeros.add(rnd.nextInt(200) + 1);
			}
			numeros.sort(null);
			System.out.println(numeros);
		}
	}

}
