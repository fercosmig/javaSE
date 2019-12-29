/**
 * 
 */
package inheritance;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file inheritance.Funcionario.java
 */
public class Funcionario {

	/**
	 * Attributes
	 */
	protected String nome;
	protected String cpf;
	protected double salario;

	/**
	 * Methods
	 */
	
	public double getBonificacao() {
        return this.salario * 0.10;
    }
	
	/**
	 * Constructors
	 */
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	/**
	 * Getters and Setters
	 */

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
