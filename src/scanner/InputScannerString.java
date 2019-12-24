/**
 * 
 */
package scanner;

import java.util.Scanner;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file scanner.InputScannerString.java
 */
public class InputScannerString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scn.next();
		System.out.println("Seu nome é " + nome);
	}

}
