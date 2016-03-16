package aula33;

public class Principal {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.peso = 100;
		p.altura = 1.65;

		double imcCalculado = p.calcularIMC();
		System.out.println("IMC do Paciente: " + imcCalculado);

		System.out.println("___________________________________________");

		IMC imc = p.calcularIndiceDeMassaCorporal();

		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso Ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de Obesidade: " + imc.grauObesidade);

	}

}
