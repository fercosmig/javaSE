/**
 * 
 */
package exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file exception.ExceptionHandling.java
 */
public class ExceptionHandling {
	private static final Logger LOGGER = LogManager.getLogger(ExceptionHandling.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = null;
		String novoTexto = null;
		try {
			novoTexto = texto.toUpperCase();
		} catch (NullPointerException e) {
			LOGGER.error(e);
			texto = "não pode ser nulo";
		} finally {
			novoTexto = texto.toUpperCase();
		}
		System.out.println(texto + " => " + novoTexto);
	}

}
