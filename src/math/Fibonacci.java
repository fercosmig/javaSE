/**
 * 
 */
package math;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file math.Fibonacci.java
 */
public class Fibonacci {

	static long fibo(int n) {
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}

	public static String listaFibonacci(Integer qtd) {

		String retorno = "";
		for (int i = 0; i < qtd; i++) {
			retorno += " | " + Fibonacci.fibo(i);
		}
		return retorno;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista = listaFibonacci(20);
		System.out.println(lista);
	}

}
