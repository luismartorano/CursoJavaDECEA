package aula35;

public class Produto {

	void definirPreco(double precoCusto) {
		// adiciona 20% ao pre�o de custo
		precoCusto = precoCusto * 1.20;

	}

	void definirPreco(Preco preco, double percentualImpostos, double margemLucro) {
		
		preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
	}

}
