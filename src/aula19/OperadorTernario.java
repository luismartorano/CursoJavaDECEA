package aula19;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		//String indicacao = idade >= 18 ? "adulto" : "crian�a/adolescente"; // idade>18 (v)-> adulto  //idade<18 (F) -> else
		String indicacao = (idade >=18) ? "adulto" : (idade <= 12 ? "crian�a" : "adolescente");
//		if(idade >= 18){
//			indicacao = "adulto";
//		} else {
//			indicacao = "crian�a / adolescente";
//		}
		
		System.out.println("Resultado: " +indicacao);

	}

}
