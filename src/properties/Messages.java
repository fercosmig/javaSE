/**
 * 
 */
package properties;

import java.util.ResourceBundle;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file properties.Messages.java
 */
public class Messages {

	private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("properties.messages");

	public static String getMessage(String key) {
		if (MESSAGES.containsKey(key)) {
			return MESSAGES.getString(key);
		}
		return null;
	}
}
