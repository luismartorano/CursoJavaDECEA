package aula41;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Martorano", 33); // passou por 2 parametros.
		// posso também passar por 1 parametro.
	
		System.out.println("Nome: " + p.nome + " tem " + p.idade + " anos!");
	}

}
