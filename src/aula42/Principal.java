package aula42;

public class Principal {

	public static void main(String[] args) {

		ArCondicionado ar = new ArCondicionado();

		// ar.temperatura = 21; //isso não funciona mais!!!!!

		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");

		boolean verifica = ar.trocarTemperatura2(10); //modo de tratar com o verifica (boolean)
		if (verifica) {
			System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");
		}
		ar.trocarTemperatura(23);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");

	}

}
