package aula28;

public class Principal {

	public static void main(String[] args) {

		Proprietario proprietario = new Proprietario();
		proprietario.nome = "José das Contas";
		proprietario.cpf = "000.000.000.000-0";
		proprietario.bairro = "Ramos";
		proprietario.cidade = "Rio de Janeiro";
		

		Carro meuCarro = new Carro();
		meuCarro.fabricante = "FIAT";
		meuCarro.modelo = "PALIO";
		meuCarro.anoFabricacao = "2011";
		meuCarro.cor = "Prata";
		
		meuCarro.proprietario = proprietario;
		
		System.out.println(meuCarro.fabricante +" Nome: "+proprietario.nome);
		System.out.println(meuCarro.fabricante);
		System.out.println(meuCarro.proprietario.nome);
		

	}

}
