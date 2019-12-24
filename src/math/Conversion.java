/**
 * 
 */
package math;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.Conversion.java
 */
public class Conversion {
	private static final Logger LOGGER = LogManager.getLogger(Conversion.class.getName());

	public double calculateResult(int value, int operation) {
		double calculation = 0;
		switch (operation) {
		case 1:
			calculation = value / 0.62137;
			break;
		case 2:
			calculation = value * 0.62137;
			break;
		case 3:
			calculation = (value - 32) / 1.8;
			break;
		case 4:
			calculation = (value * 1.8) + 32;
			break;
		default:
			break;
		}

		DecimalFormat df = new DecimalFormat("0.###");
		calculation = Double.parseDouble(df.format(calculation));
		return calculation;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] options = { "1 - Milhas para quilômetros", "2 - Quilômetros para milhas",
				"3 - Fahrenheit para celsius", "4 - Celsius para fahrenheit" };

		Object choice = JOptionPane.showInputDialog(null, "Escolha um item", "Selecao de itens",
				JOptionPane.PLAIN_MESSAGE, null, options, "");

		String chosenString = choice.toString();

		int chosenNumeric = Integer.parseInt(chosenString.substring(0, 1));
		String labelFrom = "";
		String labelTo = "";
		switch (chosenNumeric) {
		case 1:
			labelFrom = "milhas";
			labelTo = "quilômetros";
			break;
		case 2:
			labelFrom = "quilômetros";
			labelTo = "milhas";
			break;
		case 3:
			labelFrom = "graus fahrenheit";
			labelTo = "graus celsius";
			break;
		case 4:
			labelFrom = "graus celsius";
			labelTo = "graus fahrenheit";
			break;
		default:
			break;
		}

		int value = 0;
		try {
			value = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em " + labelFrom));

		} catch (NumberFormatException e) {
			// TODO: handle exception
			LOGGER.error(e);
			value = 0;
		} finally {
			Conversion c = new Conversion();
			double result = c.calculateResult(value, chosenNumeric);

			String answer = "olá, você escolheu ";
			answer += labelFrom;
			answer += " para ";
			answer += labelTo;
			answer += "\n\nO valor digitado foi: ";
			answer += value;
			answer += " ";
			answer += labelFrom;
			answer += "\n\nO resultado é: ";
			answer += result;
			answer += " ";
			answer += labelTo;
			answer += ".";

			JOptionPane.showMessageDialog(null, answer);
		}
	}

}
