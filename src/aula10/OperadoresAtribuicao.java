package aula10;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int valor1 = 20;
		int valor2 = 7 + valor1;
		System.out.println(valor2);
		
		int atribuicao = 10;
			atribuicao = atribuicao + 5;
		System.out.println(atribuicao);
		
		int teste = 22;
		teste += 2; //formato abreviado de teste=teste + 2
		System.out.println(teste);
		
		int mult = 22;
		mult *= 5; // mult = mult * 5
		System.out.println(mult);
		
		

	}

}
