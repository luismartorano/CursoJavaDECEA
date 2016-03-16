package aula43;
//get - busca o valor 
//set - insere o valor
public class Principal {

	public static void main(String[] args) {
		
		PessoaBean p = new PessoaBean();
		//isso não vai compilar pq os atributos estão privados.
		
		// p.nome = " mario";  //não compila nem por um caralho!
		
		p.setNome("RONALDO BRILHA MUITO NO CORINTHIANS,");
		p.setIdade(24);
		
		System.out.println(p.getNome() + " tem " + p.getIdade() + " anos!"); 

	}

}
