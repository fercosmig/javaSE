/**
 * 
 */
package util;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 21, 2020
 * @file util.ValidateCPF.java
 * 
 *       Sistema feito de acordo com o algorítmo da página:
 *       http://www.macoratti.net/alg_cpf.htm
 */
public class ValidateCPF {

	public static boolean verifyCPF(String cpf) {

		boolean result = false;

		if (isCPF(cpf)) {

			String digits = cpf.substring(9, 11);

			String firstDigit = calculateCheckDigit(cpf, 9);
			String secondDigit = calculateCheckDigit(cpf, 10);
			String calculatedDigits = firstDigit + secondDigit;

			if (digits.equals(calculatedDigits)) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}

	private static boolean isCPF(String cpf) {

		if (cpf == null || cpf.length() != 11) {
			return false;
		}

		String[] invalidCPF = { "000000000", "111111111", "222222222", "333333333", "444444444", "555555555",
				"666666666", "777777777", "888888888", "999999999", "123456789", "987654321" };

		String nineDigitsString = cpf.substring(0, 9);
		
		for (String s : invalidCPF) {
			if (nineDigitsString.equals(s)) {
				return false;
			}
		}

		return cpf.chars().allMatch(Character::isDigit);
	}
	
	private static String calculateCheckDigit(String cpf, final int LEN) {

		String digitsString = cpf.substring(0, LEN);

		// coloca os digitos em um array.
		int[] digitsArray = new int[LEN];
		for (int i = 0; i < LEN; i++) {
			digitsArray[i] = Integer.parseInt(digitsString.substring(i, i + 1));
		}

		// multiplica e soma os resultados.
		int sumResults = 0;
		int j = 0;
		for (int i = LEN + 1; i >= 2; i--) {
			sumResults += digitsArray[j] * i;
			j++;
		}

		// divide o valor da soma por 11 e salva o resto.
		int restSumResultsDivision = sumResults % 11;

		String checkDigit;

		if (restSumResultsDivision < 2) {
			checkDigit = "0";
		} else {
			checkDigit = Integer.toString(11 - restSumResultsDivision);
		}

		return checkDigit;
	}

}
