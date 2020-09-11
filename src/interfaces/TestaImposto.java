/**
 * 
 */
package interfaces;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Mar 3, 2020
 * @file interfaces.TestaImposto.java
 */
public class TestaImposto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(100.0);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}

}
