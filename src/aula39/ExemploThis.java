package aula39;

public class ExemploThis {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.modelo = "Palio";
		
		System.out.println("Modelo antes: "+ c.modelo);
		
		 c.alterarModelo("CIVIC");
		 //c.alterarModelo("AIRCROSS");
		
		System.out.println("modelo depois: "+c.modelo );

	}

}
