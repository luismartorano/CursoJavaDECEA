package aula16;

import java.util.Scanner;

public class EscopoVariaveis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual � a sua idade: ");
		int idade = entrada.nextInt();

		boolean podeDirigir = idade >= 18;
		String nomePai = "";

		if (!podeDirigir) {
			System.out.println("Nome do pai de fam�lia: ");
			nomePai = entrada.next();
		}

		System.out.println("Voc� pode dirigir!!!!");

		if (podeDirigir) {
			System.out.println("Sim , claro");
		} else {
			System.out.println("N�o, se fizer isso, seu pai " + nomePai + "vai preso! ");
		}

	}

}
