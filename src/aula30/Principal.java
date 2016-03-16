package aula30;
//valores padrão


public class Principal {

	public static void main(String[] args) {
		
		Carro seuCarro = new Carro();
		seuCarro.anoFabricacao = "2009";
		seuCarro.cor = "preto";
		
		seuCarro.proprietario.nome = "Pai de Família";
		
		System.out.println(seuCarro.proprietario.nome);
		System.out.println(seuCarro.anoFabricacao);
		System.out.println(seuCarro.cor);
		
		
	}

}
