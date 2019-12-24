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
 * @file bmi.BodyMassIndex.java
 */
public class BodyMassIndex {
	private static final Logger LOGGER = LogManager.getLogger(BodyMassIndex.class.getName());

	public static Double calculateBodyMassIndex(double height, double weight) {
		double result = weight / Math.pow(height, 2);
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = null;
		String title = "Body Mass Index - B. M. I.";

		try {
			message = "Digite a sua altura. Use o formato americano. Ex.: 1.65:";
			Double height = Double.parseDouble(JOptionPane.showInputDialog(null, message, title, 0));

			message = "Digite o seu peso.  Use o formato americano. Ex.: 68.5:";
			Double weight = Double.parseDouble(JOptionPane.showInputDialog(null, message, title, 0));

			DecimalFormat df = new DecimalFormat("#.##");
			String result = df.format(calculateBodyMassIndex(height, weight));
			message = "Seu índice de massa corporal (I. M. C.) é ";
			message += result;

			message += "\n\n";
			message += "TABELA DE REFERENCIA";
			message += "\n";
			message += "De 0 até 15 => Magreza grave";
			message += "\n";
			message += "De 15.1 até 17 => Magreza moderada";
			message += "\n";
			message += "De 17.1 até 18,5 => Magreza leve";
			message += "\n";
			message += "De 18,5 até 25 => Saudável";
			message += "\n";
			message += "De 25.1 até 30 => Sobrepeso";
			message += "\n";
			message += "De 30.1 até 35 => Obesidade Grau I";
			message += "\n";
			message += "De 35.1 até 40 => Obesidade Grau II (severa)";
			message += "\n";
			message += "De 40.1 para cima => Obesidade Grau III (mórbida)";

			JOptionPane.showMessageDialog(null, message, title, 0);

		} catch (NumberFormatException e) {
			LOGGER.error(e);
		} catch (NullPointerException e1) {
			LOGGER.error(e1);
		}
	}

}
