/**
 * 
 */
package math;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.SquareRoot.java
 */
public class SquareRoot {

	public static String retrieveSquareRoot(Double number) {

		double raiz = Math.sqrt(number);
		DecimalFormat df = new DecimalFormat("#.####");
		return df.format(raiz);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Raíz quadrada de um número";
		String message = "Digite um número: ";
		Double number = Double.parseDouble(JOptionPane.showInputDialog(null, message, title, 0));
		String raiz = retrieveSquareRoot(number);
		message = "A raíz quadrada de " + number + " é " + raiz;
		JOptionPane.showMessageDialog(null, message, title, 0);
	}

}
