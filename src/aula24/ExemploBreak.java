package aula24;

import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int divisor = entrada.nextInt();

		for (int i = 100; i <= 200; i++) {
			if (i % divisor == 0){
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("fim do programa");
	}

}
