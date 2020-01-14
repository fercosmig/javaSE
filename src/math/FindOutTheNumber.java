/**
 * 
 */
package math;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 14, 2020
 * @file math.FindOutTheNumber.java
 */
public class FindOutTheNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random();
		int maxNumber = 100;
		int numberSorted = rnd.nextInt(maxNumber);
		Scanner scn = new Scanner(System.in);
		int palpite = 0;
		int quantity = 0;
		boolean win = false;

		System.out.println("O sistema sorteou um número entre 0 e " + maxNumber + ", tente adivinhar.");
		while (!win) {
			quantity++;
			System.out.print("Digite o seu palpite: ");
			palpite = scn.nextInt();
			if (palpite > numberSorted) {
				System.out.println("Hummmmmmmmmmm, muito alto, tente um número menor!");
			} else if (palpite < numberSorted) {
				System.out.println("Hummmmmmmmm, muito baixo,  tente um número maior!");
			} else if (palpite == numberSorted) {
				System.out.println("Parabéns, você acertou, foram necessárias " + quantity + " tentativas");
				win = true;
			}

		}

	}

}
