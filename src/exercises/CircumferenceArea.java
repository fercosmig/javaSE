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
public class CircumferenceArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double radyus = 10.76;

		double area = getCircumferenceArea(radyus);

		System.out.println("Raio: " + radyus);
		System.out.println("Área: " + area);
	}

	/**
	 * Crie um método que receba o raio de uma circunferência e retorne a sua área.
	 */
	public static double getCircumferenceArea(double radyus) {
		double result = radyus * Math.PI;
		return result;
	}

}
