/**
 * 
 */
package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 6, 2020
 * @file exercises.Exercises.java
 */
public class Exercises {

	/**
	 * 
	 */
	public Exercises() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberInteger1, numberInteger2, resultInt;
		double numberDouble1, numberDouble2, resultDouble;
		String resultString, title, separator;

		separator = "# ";
		for (int i = 0; i < 80; i++) {
			separator += "-";
		}
		separator += " #";

		
		title = "Crie um método que receba os lados de um retangulo e retorne a sua área.";
		numberDouble1 = 10;
		numberDouble2 = 25;
		resultDouble = getRectangleArea(numberDouble1, numberDouble2);
		System.out.println(title);
		System.out.println("Largura: " + numberDouble1 + ", Altura: "+numberDouble2+". Área: " + resultDouble);
		System.out.println(separator);

		title = "Crie um método que receba o lado de um quadrado e retorne a sua área.";
		numberDouble1 = 10;
		resultDouble = getSquareArea(numberDouble1);
		System.out.println(title);
		System.out.println("Lado: " + numberDouble1 + ". Área: " + resultDouble);
		System.out.println(separator);
		
		title = "Crie um método que receba o raio de uma circunferência e retorne a sua área.";
		numberDouble1 = 10;
		resultDouble = getCircumferenceArea(numberDouble1);
		System.out.println(title);
		System.out.println("Raio: " + numberDouble1 + ". Área: " + resultDouble);
		System.out.println(separator);

		title = "Faça um Programa que converta metros para centímetros.";
		numberDouble1 = 1.74;
		resultDouble = meterToCentimeter(numberDouble1);
		System.out.println(title);
		System.out.println("metros: " + numberDouble1 + ", centímetros: " + resultDouble);
		System.out.println(separator);

		title = "Escreva um método que imprima na tela a soma dos números ímpares entre 0 e 30 e\n"
				+ "a multiplicação dos números pares entre 0 e 30.";
		System.out.println(title);
		getSumMultiplication();
		System.out.println(separator);

		title = "Crie um método que receba um número inteiro e imprima, em ordem decrescente o valor do\n"
				+ "número até 0.";
		String result = getDescendingNumbers(12);
		System.out.println(title);
		System.out.println(result);
		System.out.println(separator);

		title = "Crie um método que receba dois números e indique se são iguais ou se são\n"
				+ "diferentes. Mostre o maior e o menor (nesta sequência).";
		System.out.println(title);
		System.out.println(getComparation(1142, 12));
		System.out.println(getComparation(13, 123));
		System.out.println(getComparation(14, 12 + 2));
		System.out.println(separator);

		title = "Crie um método que receba dois números NumA e NumB, nessa ordem, e imprima\n"
				+ "em ordem inversa, isto é, se os dados lidos forem NumA = 5 e NumB = 9,\n"
				+ "por exemplo, devem ser impressos na ordem NumA = 9 e NumB = 5.";
		numberInteger1 = 12;
		numberInteger2 = 34;
		resultString = getChangedNumbers(numberInteger1, numberInteger2);
		System.out.println(title);
		System.out.println(resultString);
		System.out.println(separator);

		title = "Crie um método que receba dois números inteiros e imprima o maior entre eles.";
		numberInteger1 = 56;
		numberInteger2 = 24;
		resultInt = getBiggerNumber(numberInteger1, numberInteger2);
		System.out.println(title);
		System.out.println("1o número: " + numberInteger1 + ", 2o número: " + numberInteger2 + ". Maior: " + resultInt);
	}

	/**
	 * Crie um método que receba os lados de um retangulo e retorne a sua área.
	 */
	public static double getRectangleArea(double width, double height) {
		double result = width * height;
		return result;
	}

	/**
	 * Crie um método que receba o lado de um quadrado e retorne a sua área.
	 */
	public static double getSquareArea(double side) {
		double result = Math.pow(side, 2);
		return result;
	}

	/**
	 * Crie um método que receba o raio de uma circunferência e retorne a sua área.
	 */
	public static double getCircumferenceArea(double radyus) {
		double result = radyus * Math.PI;
		return result;
	}

	/**
	 * Faça um Programa que converta metros para centímetros.
	 */
	public static double meterToCentimeter(double number) {
		double result = number * 100;
		return result;
	}

	/**
	 * Escreva um método que imprima na tela a soma dos números ímpares entre 0 e 30
	 * e a multiplicação dos números pares entre 0 e 30.
	 */
	public static void getSumMultiplication() {
		final int NI = 0;
		final int NF = 30;

		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int i = NI; i <= NF; i++) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}
		Long multiplication = (long) 1;
		for (Integer e : even) {
			if (e > 0) {
				multiplication = multiplication * e;
			}
		}
		Integer sum = 0;
		for (Integer o : odd) {
			sum = sum + o;
		}

		System.out.println(even.toString());
		System.out.println(odd.toString());
		System.out.println("Multiplicação dos números pares: " + multiplication);
		System.out.println("Soma dos números impares: " + sum);
	}

	/**
	 * Crie um método que receba um número inteiro e imprima, em ordem decrescente,
	 * o valor do número até 0.
	 */
	public static String getDescendingNumbers(Integer n) {
		String result = "";
		for (int i = n; i >= 0; i--) {
			result += " | " + i;
		}
		return result;
	}

	/**
	 * Crie um método que receba dois números e indique se são iguais ou se são
	 * diferentes. Mostre o maior e o menor (nesta sequência).
	 */
	public static String getComparation(Integer a, Integer b) {

		String result = "";
		if (a == b) {
			result += "Os números são iguais.";
		} else {
			result += "Os números são diferentes.\n";
			if (a > b) {
				result += "Maior: " + a + " Menor: " + b;
			} else {
				result += "Maior: " + b + " Menor: " + a;
			}
		}
		return result;
	}

	/**
	 * Crie um método que receba dois números NumA e NumB, nessa ordem, e imprima em
	 * ordem inversa, isto é, se os dados lidos forem NumA = 5 e NumB = 9, por
	 * exemplo, devem ser impressos na ordem NumA = 9 e NumB = 5.
	 */
	public static String getChangedNumbers(Integer numA, Integer numB) {

		String result = "Numero recebido na variavel numA = " + numA + "\n";
		result += "Numero recebido na variavel numB = " + numB + "\n";
		result += "...fazendo a troca...\n";

		Integer aux;
		aux = numA;
		numA = numB;
		numB = aux;

		result += "Numero em numA = " + numA + "\n";
		result += "Numero em numB = " + numB;

		return result;
	}

	/**
	 * Crie um método que receba dois números inteiros e imprima o maior entre eles.
	 */
	public static Integer getBiggerNumber(Integer a, Integer b) {
		Integer result = (a > b ? a : b);
		return result;
	}

}
