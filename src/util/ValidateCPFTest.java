/**
 * 
 */
package util;

import java.util.Scanner;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 22, 2020
 * @file util.ValidateCPFTest.java
 */
public class ValidateCPFTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Digite seu CPF: ");
		String cpf = scn.next();

		try {
			boolean verificado = ValidateCPF.verifyCPF(cpf);
			if (verificado) {
				System.out.println(cpf + " :: CPF OK.");
			} else {
				System.out.println(cpf + " :: CPF falso / inválido.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		scn.close();
	}

}
