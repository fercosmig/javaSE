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
public class SquareArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double side = 14.67;

		double area = getSquareArea(side);

		System.out.println("Lado: " + side);
		System.out.println("Área: " + area);

	}

	/**
	 * Crie um método que receba o lado de um quadrado e retorne a sua área.
	 */
	public static double getSquareArea(double side) {
		double result = Math.pow(side, 2);
		return result;
	}

}
