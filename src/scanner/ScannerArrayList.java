/**
 * 
 */
package scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 24, 2019
 * @file scanner.ScannerArrayList.java
 */
public class ScannerArrayList {
	private static final Logger LOGGER = LogManager.getLogger(ScannerArrayList.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		Integer n = null;

		for (int i = 0; i < 10; i++) {
			n = 0;

			try {
				System.out.print("Digite o número de índice " + i + ": ");
				n = s.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				LOGGER.error(e);
				n = 0;
				s = new Scanner(System.in);
			} finally {
				numeros.add(n);
			}
		}

		System.out.println("Você digitou os numeros: ");
		for (Integer ns : numeros) {
			System.out.print(ns + ", ");
		}
		System.out.println("\n\n");
		LOGGER.info("fim de execução.");
	}

}
