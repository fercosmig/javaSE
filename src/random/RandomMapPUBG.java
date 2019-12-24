/**
 * 
 */
package random;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file random.RandomMapPUBG.java
 */
public class RandomMapPUBG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();

		// lista de mapas
		ArrayList<String> maps = new ArrayList<String>();
		maps.add("Erangel");
		maps.add("Miramar");
		maps.add("Vikendi");
		maps.add("Sanhok");

		// número de mapas
		int number_of_maps = maps.size();
		// System.out.println(nm);

		// numero sorteado
		int erangel = 0;
		int miramar = 0;
		int vikendi = 0;
		int sanhok = 0;
		int randon_number = 0;
		for (int i = 0; i < 150; i++) {
			randon_number = rnd.nextInt(number_of_maps);
			System.out.println("(" + i + ") " + randon_number + " - " + maps.get(randon_number));

			if (randon_number == 0) {
				erangel++;
			}
			if (randon_number == 1) {
				miramar++;
			}
			if (randon_number == 2) {
				vikendi++;
			}
			if (randon_number == 3) {
				sanhok++;
			}
		}
		System.out.println("O mapa " + maps.get(0) + " foi sorteado " + erangel + " vezes");
		System.out.println("O mapa " + maps.get(1) + " foi sorteado " + miramar + " vezes");
		System.out.println("O mapa " + maps.get(2) + " foi sorteado " + vikendi + " vezes");
		System.out.println("O mapa " + maps.get(3) + " foi sorteado " + sanhok + " vezes");
	}

}
