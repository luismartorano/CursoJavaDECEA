package aula20;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class OperadorIncrementDecrement {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com a sua idade: ");
		int idade = entrada.nextInt();
		
		int incremento = ++idade; //usar essa sempre
		int incremento2 = idade++;
		
		System.out.println("Incremento1: "+incremento);
		System.out.println("Incremento2: "+incremento2);
		
		
		
		
		

	}

}
