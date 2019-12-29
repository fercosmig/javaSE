/**
 * 
 */
package inheritance;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 28, 2019
 * @file inheritance.TestInheritance.java
 */
public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		f.setNome("Fernanda");
		f.setCpf("333.333.333-33");
		f.setSalario(1000.0);
		System.out.println("Funcionario f = new Funcionario()");
		System.out.println(f.getBonificacao());

		/**
		 * Desta forma o objeto Funcionario() não possui os atributos: "senha" e
		 * "numeroDeFuncionariosGerenciados" da classe Gerente(), porém o método
		 * getBonificacao() é da classe Gerente().
		 */
		Funcionario fg = new Gerente();
		fg.setNome("Simone");
		fg.setCpf("444.444.444-44");
		fg.setSalario(1000.0);
		System.out.println("Funcionario fg = new Gerente() // (Sem atributos da classe Gerente())");
		System.out.println(fg.getBonificacao());

		Gerente g = new Gerente();
		g.setNome("Fernando");
		g.setCpf("222.222.222.22");
		g.setSalario(1000.0);
		g.setSenha(222);
		g.setNumeroDeFuncionariosGerenciados(2222);
		System.out.println("Gerente g = new Gerente()");
		System.out.println(g.getBonificacao());

	}

}
