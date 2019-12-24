/**
 * 
 */
package random;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file random.RandomMusic.java
 */
public class RandomMusic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount_of_songs = 1567;
		for (int i = 0; i < 15; i++) {
			double result_random = Math.random();
			double random_number = result_random * (amount_of_songs + 1);
			System.out.println("(" + i + ")" + result_random + " x " + amount_of_songs + "= " + (int) random_number);
		}
	}

}
