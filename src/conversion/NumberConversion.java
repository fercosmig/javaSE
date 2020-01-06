/**
 * 
 */
package conversion;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 3, 2020
 * @file conversion.NumberConversion.java
 */
public class NumberConversion {

	/**
	 * 
	 */
	public NumberConversion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 1256;
		System.out.println(a + " em hexadecimal é: " + decimalToHexadecimal(a));
		
		String b = Integer.toBinaryString(a);
		String c = Integer.toOctalString(a);
		String d = Integer.toHexString(a).toUpperCase();
		System.out.println(a + " em binario é: " + b);
		System.out.println(a + " em octal é: " + c);
		System.out.println(a + " em hexadecimal é: " + d);
		
	}

	public static String decimalToHexadecimal(Integer decimalNumber) {

		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		int restOfDivision;
		String hexadecimalNumber = "";

		while (decimalNumber > 0) {
			restOfDivision = decimalNumber % 16;
			hexadecimalNumber = hex[restOfDivision] + hexadecimalNumber;
			decimalNumber = decimalNumber / 16;
		}
		return hexadecimalNumber;
	}
}
