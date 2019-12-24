/**
 * 
 */
package math;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.Loterias.java
 */
public class Loterias {
	private static final Logger LOGGER = LogManager.getLogger(Loterias.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero_sorteado;
		int quantidade = 0;
		int quantidade_dezenas = 0;
		try {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja sortear? "));
			quantidade_dezenas = Integer.parseInt(JOptionPane.showInputDialog("Quantas dezenas tem a cartela? "));

		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e);
			quantidade = 0;
			quantidade_dezenas = 0;
		} finally {
			System.out.println("sorteados " + quantidade + " números.");
			for (int i = 0; i < quantidade; i++) {
				numero_sorteado = (int) (Math.random() * quantidade_dezenas + 1);
				System.out.print(numero_sorteado + " ");
				numeros.add(numero_sorteado);
			}
			Collections.sort(numeros);
			JOptionPane.showMessageDialog(null, "sorteados " + quantidade + " números." + "\n" + numeros.toString());
		}
	}

}
