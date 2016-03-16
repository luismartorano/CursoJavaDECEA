package aula31;
//valores padrão

public class Principal {

	public static void main(String[] args) {

		Proprietario dono = new Proprietario();
		dono.nome = "João da Silva";

		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";

		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.proprietario = dono;
		seuCarro.proprietario = dono;
		
		System.out.println("Antes da mudança");
		System.out.println(meuCarro.proprietario.nome);
		System.out.println(seuCarro.proprietario.nome);
		System.out.println(dono.nome);
		
		System.out.println();
		
		seuCarro.proprietario.nome = "Sebastião";
		
		
		//meuCarro.proprietario.nome = "Sebastião";
		//dono.nome = "Sebastião";
	
		
		System.out.println("Depois da Mudança");
		System.out.println(meuCarro.proprietario.nome);
		System.out.println(seuCarro.proprietario.nome);
		System.out.println(dono.nome);
		
		
		

	}

}
