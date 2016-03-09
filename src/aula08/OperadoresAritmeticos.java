package aula08;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		/*
		 * Adição +
		 * Subtração -
		 * Multiplicação *
		 * Divisão /
		 * Módulo %
		 **/ 
		int soma = 2 + 10;
		int subtracao = 15 - 5;
		int mult = 2 * 226;
		int div = 1228 / 2;
		int mod = 5 % 2;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(mod);
		
		int nota1 = 9;
		int nota2 = 8;
		int nota3 = 5;
		
		System.out.println("-----------------------------");
		
		int totalGeral = nota1 + nota2 + nota3;
		System.out.println("Total Geral: " +totalGeral);
		
		int mediaGeral = (nota1 + nota2 + nota3)/3;
		System.out.println("Média Geral: " +mediaGeral);
		
	

	}

}
