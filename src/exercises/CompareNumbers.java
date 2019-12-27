/**
 * Crie uma classe java ComparaNumero que contenha um método que receba dois
 * números e indique se são iguais ou se são diferentes. Mostre o maior e o
 * menor (nesta sequência).
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 27, 2019
 * @file exercises.CompareNumbers.java
 */
public class CompareNumbers {

	public static String getComparation(Integer a, Integer b) {
	
		String result = "";
		if (a == b) {
			result += "Os números são iguais.";
		} else {
			result += "Os números são diferentes.\n";
			if (a > b) {
				result += "Maior: "+a+" Menor: "+b;
			}else {
				result += "Maior: "+b+" Menor: "+a;
			}
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println(getComparation(1142, 12));
System.out.println(getComparation(13, 123));
System.out.println(getComparation(14, 12+2));
		

		
	}

}
