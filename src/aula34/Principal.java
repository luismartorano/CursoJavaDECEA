package aula34;

public class Principal {

	public static void main(String[] args) {
		
		FolhaPagamento f = new FolhaPagamento();
		double salario = f.calcularSal(160, 12, 32.5, 40.2);
		
		System.out.println("Salário Calculado: " +salario);
		
		

	}

}
