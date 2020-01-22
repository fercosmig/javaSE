/**
 * 
 */
package util;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 21, 2020
 * @file util.CreateCPF.java
 * 
 *       Sistema feito de acordo com o algorítmo da página:
 *       http://www.macoratti.net/alg_cpf.htm
 */
public class CreateCPF {

	public static String createDigitsCPF(String cpf) {

		String cpfWithTenDigits, cpfWithElevenDigits;
		
		if (isCPF(cpf)) {
			cpfWithTenDigits = calculateCheckDigit(cpf, 9);
			cpfWithElevenDigits = calculateCheckDigit(cpfWithTenDigits, 10);
			return cpfWithElevenDigits;
		} else {
			return "CPF inválido";
		}
	}

	private static boolean isCPF(String cpf) {

		if (cpf == null || cpf.length() != 9) {
			return false;
		}

		String[] invalidCPF = { "000000000", "111111111", "222222222", "333333333", "444444444", "555555555",
				"666666666", "777777777", "888888888", "999999999", "123456789", "987654321" };

		for (String s : invalidCPF) {
			if (cpf.equals(s)) {
				return false;
			}
		}

		return cpf.chars().allMatch(Character::isDigit);
	}
	
	private static String calculateCheckDigit(String cpf, final int LEN) {

		// coloca os digitos em um array.
		int[] digitsArray = new int[LEN];
		for (int i = 0; i < LEN; i++) {
			digitsArray[i] = Integer.parseInt(cpf.substring(i, i + 1));
		}

		// multiplica e soma os resultados.
		int sumResults = 0;
		int j = 0;
		for (int i = LEN + 1; i >= 2; i--) {
			sumResults += digitsArray[j] * i;
			j++;
		}

		// divide o valor da some por 11 e salva o resto.
		int restSumResultsDivision = sumResults % 11;

		String checkDigit;

		// calcula o valor do digito.
		if (restSumResultsDivision < 2) {
			checkDigit = "0";
		} else {
			checkDigit = Integer.toString(11 - restSumResultsDivision);
		}

		// retorna o cpf já com o novo digito.
		return cpf + checkDigit;
	}

}
