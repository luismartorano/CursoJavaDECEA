package aula35;

public class Principal {

	public static void main(String[] args) {
		
//		double preco = 140;
//		
//		Produto p = new Produto();
//		p.definirPreco(preco);
//		System.out.println("Pre�o: R$" +preco);
		
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor Custos: " +preco.valorCustos);
		System.out.println("Valor Impostos: " +preco.valorImpostos);
		System.out.println("Valor Lucro: " +preco.valorLucro);
		System.out.println("Pre�o Venda: " +preco.precoVenda);
		

	}

}
