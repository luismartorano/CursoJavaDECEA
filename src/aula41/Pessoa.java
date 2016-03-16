package aula41;
 
public class Pessoa {
	
	String nome;
	int idade;
	
	//construtor nome
	//Pessoa(){
	//	
	//}
	
	//como saber se é um construtor?
	//1- não tem retorno e tb não é utilizado void
	//2- tem o mesmo nome da classe
	
	Pessoa(String nome){
		this.nome = nome;
	} 
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

}
