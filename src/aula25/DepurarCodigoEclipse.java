package aula25;

import java.util.Scanner;

public class DepurarCodigoEclipse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ultimo n�mero: ");
		int numeroFinal = entrada.nextInt();
		
		System.out.println();
		
		//for (inicia��o; condi��o; incremento)
		for(int i=0; i <= numeroFinal; i++){
			System.out.println(i);
		}

	}

}
