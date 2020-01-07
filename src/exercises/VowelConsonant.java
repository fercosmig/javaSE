/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.VowelConsonant.java
 */
public class VowelConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String letter;
		boolean result;
		
		letter = "B";
		result = isVowel(letter);
		if (result) {
			System.out.println(letter + " é uma vogal.");
		}else {
			System.out.println(letter + " não é uma vogal.");
		}

	}

	/**
	 * Crie um método que verifique se uma letra digitada é vogal ou consoante.
	 */
	
	public static boolean isVowel(String letter) {
		
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		boolean result = false;
		
		for (String v : vowels) {
		if (letter.toLowerCase().equals(v)) {
			result = true;
			}
		}
		return result;
	}
}
