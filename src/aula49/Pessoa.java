package aula49;

public class Pessoa {

	// para funcionar a heran�a em Java, os modificadores dever�o ser protected
	// - public

	String nome;
	protected int idade;

	public void seApresentar() {
		System.out.println("Ol�, eu sou o " + nome + ", e tenho " + idade + " anos");
	}

}
