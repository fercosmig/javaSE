/**
 * 
 */
package math;

import java.util.Calendar;
import java.util.Random;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.MultiplicationMatrices.java
 */
public class MultiplicationMatrices {
	public static final int DIMENSION = 750;
	public static final int NUMBER_MAX_VALUE = 10;

	public static void multiplyMatrices(int matrixA[][], int matrixB[][], int matrixAB[][], int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				matrixAB[i][j] = 0;
				for (int k = 0; k < l; k++) {
					matrixAB[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
	}

	public static void printMatrix(int matrix[][], int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void randomize(int matrix[][], int l) {
		Random ng = new Random();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				int n = ng.nextInt(NUMBER_MAX_VALUE);
				matrix[i][j] = n;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ma[][] = new int[DIMENSION][DIMENSION];
		int mb[][] = new int[DIMENSION][DIMENSION];
		int mab[][] = new int[DIMENSION][DIMENSION];

		randomize(ma, DIMENSION);
		// System.out.println("Matriz A: ");
		// printMatrix(ma, DIMENSION);
		// System.out.println("\n");

		randomize(mb, DIMENSION);
		// System.out.println("Matriz B: ");
		// printMatrix(mb, DIMENSION);
		// System.out.println("\n");

		Calendar ci = Calendar.getInstance();
		// System.out.println(DIMENSION + " Start: " + ci.getTime());
		// System.out.println("Matriz A * B: ");
		multiplyMatrices(ma, mb, mab, DIMENSION);
		// printMatrix(mab, DIMENSION);
		Calendar cf = Calendar.getInstance();
		// System.out.println(DIMENSION + " Stop: " + cf.getTime());

		long diffms = 0;
		long diffsec = 0;
		diffms = cf.getTimeInMillis() - ci.getTimeInMillis();
		System.out.println(DIMENSION + " Foram necessários " + diffms + " milisegundos");
		diffsec = diffms / 1000;
		System.out.println(DIMENSION + " Foram necessários " + diffsec + " segundos");
	}

}
