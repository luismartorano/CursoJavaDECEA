package aula38;

/*Trabalhando com arrays em java
 * */

public class TesteArrays {

	public static void main(String[] args) {

		// int[] notas;
		// notas = new int[4];

		int[] notas = new int[4]; // array de 4 posições
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		System.out.println("_________________________________________________\n");
		for (int i = 0; i < 4; i++) {
			System.out.println("Posicao[" + i + "]=" + notas[i]);
		}
		
		// notas Ã© um objeto de tipo Array
		// usando mÃ©todo length
		System.out.println("_________________________________________________\n");
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		System.out.println("_________________________________________________\n");
		
		System.out.println("Tamanho do array: " + notas.length);
		System.out.println("_________________________________________________\n");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posicao[" + i + "]=" + notas[i]);
		}
		System.out.println("_________________________________________________");
	}

}
