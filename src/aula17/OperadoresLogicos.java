package aula17;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.println();
		System.out.println("Seu nome: " + nome);

		System.out.println("Peso: ");
		int peso = entrada.nextInt();

		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite: Masculino: 1 , Feminino: 2");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		

		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);
		
		if((sexo == 'F' && imc < 19.1) || (sexo =='M' && imc < 20.7))
			System.out.println("Abaixo do Peso!");
		else if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 26.4))
			System.out.println("Peso ideal");
		else
			System.out.println("Continua!");
		

		
	}

}
