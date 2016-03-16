package aula18;

import java.util.Scanner;

public class EstruturaControleSwitch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o final da placa: 1 ou 2 ");
		int finalPlaca = entrada.nextInt();
		int resultado = 0;

		if (finalPlaca >= 1 && finalPlaca <= 2) {
			resultado = finalPlaca++;
		} else
			System.out.println("Por favor digite a placa de 1 a 2");

		switch (resultado) {
		case 1:
			System.out.println("Vencimento dia 11 de janeiro");
			break;
		case 2:
			System.out.println("Vencimento dia 12 de Janeiro");
			break;
		default:
			System.out.println("Vencimento sem data, desculpe");

		}

	}

}
