package aula44.treinador;

import aula44.animal.Cachorro; //para importar eu clico em Cachorro lá embaixo e digito CTRL SHIFT O

public class TreinadorCachorro {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.setNome("Thor");
		
		DonoCachorro dc = new DonoCachorro();
		dc.ensinarCachorroSentar(c); //recebeu o parâmetro cachorro
	}
}
