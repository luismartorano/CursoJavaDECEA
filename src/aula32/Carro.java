package aula32;

public class Carro {

	String fabricante = "Sem Fabricante";
	String modelo;
	int anoFabricacao = 2011;
	String cor;
	boolean biCombustivel = true;

	Proprietario proprietario;

	String retornaNome() {
		return "José das Coves";
	}

	void ligar() {
		System.out.println("Ligando o carro: " + modelo);
	}

	@Override 
	//Caminho: source - generate to string (gera o toString automaticamente)
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", cor="
				+ cor + ", biCombustivel=" + biCombustivel + ", proprietario=" + proprietario + "]";
	}
	
	

}
