/**
 * 
 */
package exercises;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 7, 2020
 * @file exercises.RectangleArea.java
 */
public class MeterToCentimeter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double meters = 1.74;

		double centimeters = meterToCentimeter(meters);

		System.out.println("Metros: " + meters);
		System.out.println("Centímetros: " + centimeters);

	}

	/**
	 * Faça um Programa que converta metros para centímetros.
	 */
	public static double meterToCentimeter(double number) {
		double result = number * 100;
		return result;
	}

}
