package aula43;
//get - busca o valor 
//set - insere o valor
public class Principal {

	public static void main(String[] args) {
		
		PessoaBean p = new PessoaBean();
		//isso n�o vai compilar pq os atributos est�o privados.
		
		// p.nome = " mario";  //n�o compila nem por um caralho!
		
		p.setNome("RONALDO BRILHA MUITO NO CORINTHIANS,");
		p.setIdade(24);
		
		System.out.println(p.getNome() + " tem " + p.getIdade() + " anos!"); 

	}

}
