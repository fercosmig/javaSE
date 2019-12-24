/**
 * 
 */
package math;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.MultiplicationTables.java
 */
public class MultiplicationTables {
	private static final Logger LOGGER = LogManager.getLogger(MultiplicationTables.class.getName());

	public String calculate(int value) {
		String answer = "";
		for (int i = 1; i < 11; i++) {
			answer += value;
			answer += " x ";
			answer += i;
			answer += " = ";
			answer += i * value;
			answer += "\n";
		}
		return answer;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		try {
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja ver a tabuada: "));
		} catch (NumberFormatException e) {
			// TODO: handle exception
			LOGGER.error(e);
			number = 0;
		} finally {
			MultiplicationTables c = new MultiplicationTables();
			JOptionPane.showMessageDialog(null, c.calculate(number));
		}
	}

}
