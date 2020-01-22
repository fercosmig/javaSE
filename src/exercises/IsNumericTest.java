/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 22, 2020
 * @file exercises.IsNumericTest.java
 */
public class IsNumericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("isNumericWithCharacter");
		System.out.println(isNumericWithCharacter("123")); // true
		System.out.println(isNumericWithCharacter("-123")); // false
		System.out.println(isNumericWithCharacter("12.3")); // false
		System.out.println(isNumericWithCharacter("12,3")); // false
		
		System.out.println("isNumericWithLong");
		System.out.println(isNumericWithLong("123")); // true
		System.out.println(isNumericWithLong("-123")); // true
		System.out.println(isNumericWithLong("12.3")); // false
		System.out.println(isNumericWithLong("12,3")); // false
		
		System.out.println("isNumericWithDouble");
		System.out.println(isNumericWithDouble("123")); // true
		System.out.println(isNumericWithDouble("-123")); // true
		System.out.println(isNumericWithDouble("12.3")); // true
		System.out.println(isNumericWithDouble("12,3")); // false

		System.out.println("isNumericWithRegularExpression");
		System.out.println(isNumericWithRegularExpression("123")); // true
		System.out.println(isNumericWithRegularExpression("-123")); // true
		System.out.println(isNumericWithRegularExpression("12.3")); // true
		System.out.println(isNumericWithRegularExpression("12,3")); // false

	}
	
	private static boolean isNumericWithRegularExpression(String number){
	  return number.matches("-?\\d+(\\.\\d+)?");
	  
	  /**
	  return number.matches("^[0-9]+$");
	  */
	}

	private static boolean isNumericWithDouble(String number) {
		
		boolean result;
		try {
			Double.parseDouble(number);
			result = true;
		} catch (NumberFormatException e) {
			result = false;
		}
		return result;
	}

	
	private static boolean isNumericWithLong(String number) {
		
		boolean result;
		try {
			Long.parseLong(number);
			result = true;
		} catch (NumberFormatException e) {
			result = false;
		}
		return result;
	}
	
	private static boolean isNumericWithCharacter(String number) {
		
		return number.chars().allMatch(Character::isDigit);
		
		/**
		for (char c : number.toCharArray()) {
	        if (!Character.isDigit(c))
	            return false;
	    }
	    return true;
	    */
	}
	
}
