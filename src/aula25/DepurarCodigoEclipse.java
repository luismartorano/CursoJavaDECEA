package aula25;

import java.util.Scanner;

public class DepurarCodigoEclipse {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ultimo número: ");
		int numeroFinal = entrada.nextInt();
		
		System.out.println();
		
		//for (iniciação; condição; incremento)
		for(int i=0; i <= numeroFinal; i++){
			System.out.println(i);
		}

	}

}
