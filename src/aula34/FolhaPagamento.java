package aula34;

public class FolhaPagamento {

	double calcularSal(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {

		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtras * valorHoraExtra;

		return valorHorasNormais + valorHorasExtras;
	}

}
