package aula37;

public class Principal {

	public static void main(String[] args) {

		Integer i = new Integer(10); // este é o padrão;

		Integer ii = 10; // funciona tb - BOXING

		int x = i; // unboxing

		/*
		 * Dependendo do Programa poderá perder desempenho pois o Java está
		 * convertendo esses valores
		 */

		// a forma correta
		int xx = i.intValue();

		System.out.println("--------------------------------");

		Integer i1 = 127;
		Integer i2 = 127;

		Integer i3 = 128;
		Integer i4 = 128;

		System.out.println(i1 == i2);// true
		System.out.println(i3 == i4);// false - dá false pq int vai até 127...

		// Intervalo do Integer - 128 a 127 - funciona

		System.out.println("----------------------------------");

		System.out.println("Forma Correta de Comparar Objetos:\n");

		System.out.println(i1.equals(i2));// true
		System.out.println(i3.equals(i4));// true

		System.out.println("----------------------------------");

		String curso = "DECEA";
		String curso2 = "decea";
		String texto = "Curso Java OO";
		System.out.println(curso.equals(curso2));// false
		System.out.println(curso.equalsIgnoreCase(curso2)); // true

		System.out.println("----------------------------------");

		System.out.println(texto.toUpperCase());// tudo maiusculo
		System.out.println(texto.toLowerCase()); // tudo minúsculo

	}

}
