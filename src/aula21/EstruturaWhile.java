package aula21;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número inicial: ");
		int numInicial = entrada.nextInt();
		
		System.out.println("Digite o número final: ");
		int numFinal = entrada.nextInt();
		
		int numAtual = numInicial; //obrigado sempre a inicializar o primeiro numero, "o inicial".
		
		System.out.println();
		
		while(numAtual <= numFinal){
			System.out.println(numAtual);
			numAtual++;
		}
		

	}

}
