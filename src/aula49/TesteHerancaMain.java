package aula49;

public class TesteHerancaMain {

	public static void main(String[] args) {

		Jogador j = new Jogador();

		j.nome = "Ronaldo 9";
		j.idade = 38;
		j.aindaJoga = true;

		j.seApresentar();
		j.dizerSeAindaJoga();

		Tecnico t = new Tecnico();

		System.out.println();
		t.nome = "Cuca Beludo";
		t.idade = 54;
		t.seApresentar();

	}

}
