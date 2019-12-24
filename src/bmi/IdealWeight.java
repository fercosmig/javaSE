/**
 * 
 */
package bmi;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file bmi.IdealWeight.java
 */
public class IdealWeight {
	private static final Logger LOGGER = LogManager.getLogger(IdealWeight.class.getName());

	private static final double BMI_MINIMUM = 18.5;
	private static final double BMI_IDEAL = 23;
	private static final double BMI_MAXIMUM = 25;

	public static Double calculateMinimumWeight(double height) {
		double result = BMI_MINIMUM * Math.pow(height, 2);
		return result;
	}

	public static Double calculateIdealWeight(double height) {
		double result = BMI_IDEAL * Math.pow(height, 2);
		return result;
	}

	public static Double calculateMaximumWeight(double height) {
		double result = BMI_MAXIMUM * Math.pow(height, 2);
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = null;
		String title = "Peso ideal de acordo com sua altura";

		try {
			message = "Digite a sua altura. Use o formato americano. Ex.: 1.65:";
			Double height = Double.parseDouble(JOptionPane.showInputDialog(null, message, title, 0));

			message = "Sua altura é ";
			message += height;

			DecimalFormat df = new DecimalFormat("#.##");
			String result = df.format(calculateMinimumWeight(height));

			message += "\n\n";
			message += "O peso MÍNIMO aceitável para uma pessoa da sua altura é ";
			message += result;

			result = df.format(calculateMaximumWeight(height));

			message += "\n\n";
			message += "O peso MÁXIMO aceitável para uma pessoa da sua altura é ";
			message += result;

			result = df.format(calculateIdealWeight(height));

			message += "\n\n";
			message += "O peso IDEAL para uma pessoa da sua altura é ";
			message += result;

			JOptionPane.showMessageDialog(null, message, title, 0);

		} catch (NumberFormatException e) {
			LOGGER.error(e);
		} catch (NullPointerException e1) {
			LOGGER.error(e1);
		}
	}

}
