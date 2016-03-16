package aula32;
//valores padrão

public class Principal {

	public static void main(String[] args) {

		Proprietario proprietario = new Proprietario();
		proprietario.nome = "José das Contas";
		proprietario.cpf = "000.000.000.000-0";
		proprietario.bairro = "Ramos";
		proprietario.cidade = "Rio de Janeiro";
		proprietario.logradouro = "Rua A";
		proprietario.idade = 19;

		Carro c = new Carro();
		c.fabricante = "FIAT";
		c.modelo = "PALIO";
		c.anoFabricacao = 2011;
		c.cor = "Prata";
		c.proprietario = proprietario;

		System.out.println(c.toString());

	}

}
