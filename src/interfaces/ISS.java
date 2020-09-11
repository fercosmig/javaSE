/**
 * 
 */
package interfaces;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Mar 3, 2020
 * @file interfaces.ISS.java
 */
public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * .06;
	}
}
