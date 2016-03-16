package aula39;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	public int anoDeFabricacao; 
	boolean biCombustivel;
	
	Proprietario dono;
	
	//método não teve efeito nenhum
	void alterarModelo(String modelo){
		this.modelo = modelo;
	}
	
	void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}
	
}
