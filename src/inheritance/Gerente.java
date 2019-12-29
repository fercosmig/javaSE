/**
 * 
 */
package inheritance;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file inheritance.Gerente.java
 */
public class Gerente extends Funcionario {
	
	/**
	 * Attributes
	 */
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	/**
	 * Methods
	 */
	
	@Override
	public double getBonificacao() {
        return this.salario * 0.15;
    }
	
	/**
	 * constructors 
	 */
	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param senha
	 * @param numeroDeFuncionariosGerenciados
	 */
	public Gerente(int senha, int numeroDeFuncionariosGerenciados) {
		super();
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	/**
	 * Getters and Setters
	 */

	/**
	 * @return the senha
	 */
	public int getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}

	/**
	 * @return the numeroDeFuncionariosGerenciados
	 */
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	/**
	 * @param numeroDeFuncionariosGerenciados the numeroDeFuncionariosGerenciados to set
	 */
	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

}
