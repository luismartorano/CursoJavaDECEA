package aula26;


/*
 * Introdução a Orientação a Objetos - OO
 * 
 * */
public class Principal {

	public static void main(String[] args) {
		
		
		Carro c= new Carro();
		Carro c2 = new Carro();
		
		
		c.marca = "Citroen";
		c.cor = "Chumbo";
		c.anoFabricacao = "2016";
		c.modelo = "AirCross";
		
		c2.marca = "FIAT";
		c2.cor = "Vermelho";
		c2.anoFabricacao="2008";
		c2.modelo = "PALIO WEEKEND";
		
		System.out.println("Marca: "+c.marca +"\nModelo: "+c.modelo +"\nAno Fabricação: "+c.anoFabricacao +"\nCor: "+c.cor);
		
		System.out.println("________________________________________\n");
		
		System.out.println("Marca: "+c2.marca +"\nModelo: "+c2.modelo +"\nAno Fabricação: "+c2.anoFabricacao +"\nCor: "+c2.cor);
		
		
		
	}

}
