package aula31;
//valores padr�o

public class Principal {

	public static void main(String[] args) {

		Proprietario dono = new Proprietario();
		dono.nome = "Jo�o da Silva";

		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";

		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.proprietario = dono;
		seuCarro.proprietario = dono;
		
		System.out.println("Antes da mudan�a");
		System.out.println(meuCarro.proprietario.nome);
		System.out.println(seuCarro.proprietario.nome);
		System.out.println(dono.nome);
		
		System.out.println();
		
		seuCarro.proprietario.nome = "Sebasti�o";
		
		
		//meuCarro.proprietario.nome = "Sebasti�o";
		//dono.nome = "Sebasti�o";
	
		
		System.out.println("Depois da Mudan�a");
		System.out.println(meuCarro.proprietario.nome);
		System.out.println(seuCarro.proprietario.nome);
		System.out.println(dono.nome);
		
		
		

	}

}
