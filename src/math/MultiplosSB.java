/**
 *  Ler 30 números, informar quantos números são multiplos de 5 e informar a média dos números multiplos de 3.
 */
package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.MultiplosSB.java
 */
public class MultiplosSB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> trintaNumeros = new ArrayList<Integer>();
		int n = 0;
		for (int i = 0; i < 30; i++) {
			n = (int) (Math.random() * 1000);
			trintaNumeros.add(n);
		}
		List<Integer> multiplosDeTres = new ArrayList<Integer>();
		List<Integer> multiplosDeCinco = new ArrayList<Integer>();
		for (Integer x : trintaNumeros) {
			System.out.print(x + " ");
			if (x % 3 == 0) {
				multiplosDeTres.add(x);
			}
			if (x % 5 == 0) {
				multiplosDeCinco.add(x);
			}
		}
		System.out.println(" ");
		Integer somaDosMultiplosDeTres = 0;
		for (Integer y : multiplosDeTres) {
			somaDosMultiplosDeTres += y;
		}

		String msg = "Quantidade de valores multiplos de 5: ";
		msg += multiplosDeCinco.size();
		System.out.println(msg);
		
		msg = "Média dos valores multiplos de 3: ";
		msg += somaDosMultiplosDeTres / multiplosDeTres.size();
		System.out.println(msg);
	}

}
