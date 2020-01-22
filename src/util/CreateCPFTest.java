/**
 * 
 */
package util;

import java.util.Scanner;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 22, 2020
 * @file util.CreateCPFTest.java
 */
public class CreateCPFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Digite os nove digitos do novo CPF: ");
		String cpf = scn.next();

		try {
			String newCPF = CreateCPF.createDigitsCPF(cpf);

			System.out.println("O nove CPF válido é: " + newCPF);

		} catch (Exception e) {
			e.printStackTrace();
		}
		scn.close();
		
	}

}
