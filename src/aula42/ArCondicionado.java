package aula42;

import javax.swing.JOptionPane;

public class ArCondicionado {

	private int temperatura;

	// protected //public

	public void trocarTemperatura(int temperatura) {
		if (temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
		} else {
			mensagemErro();
		}
	}

	public boolean trocarTemperatura2(int temperatura) {

		boolean verifica = true;
		if (temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
			verifica = true;
		} else {
			mensagemErro();
			verifica = false;
		}
		return verifica;
	}

	private void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Temperatura deve ser maior" + "ou igual a 17 e menor ou igual a 25.");

	}

	public int obterTemperatura() {
		return temperatura;
	}

}
