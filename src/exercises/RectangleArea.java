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
public class RectangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double width = 10.87;
		double height = 25.49;

		double area = getRectangleArea(width, height);

		System.out.println("Largura: " + width);
		System.out.println("Altura: " + height);
		System.out.println("Área: " + area);
	}

	/**
	 * Crie um método que receba os lados de um retangulo e retorne a sua área.
	 */
	public static double getRectangleArea(double width, double height) {
		double result = width * height;
		return result;
	}

}
