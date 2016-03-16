package aula47;

public enum Naipe {

	OURO("vermelho"), PAUS("preto"), ESPADA("preto"), COPAS("Vermelho");

	private String cor;

	Naipe(String cor) { // set seta as cores
		this.cor = cor;
	}

	public String getCor() { // get - retorna STRING
		return cor;
	}

}
