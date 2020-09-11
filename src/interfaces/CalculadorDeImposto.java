/**
 * 
 */
package interfaces;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Mar 3, 2020
 * @file interfaces.CalculadorDeImposto.java
 */
public class CalculadorDeImposto {

	/**
	 * Methods
	 */
	
	/**
	 * @param orcamento
	 * @param imposto
	 */
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		double resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
		
	}
	
}
