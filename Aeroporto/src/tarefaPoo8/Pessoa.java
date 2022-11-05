package tarefaPoo8;


public class Pessoa {
	String nome;
	String dataNascimento;
	int idade;
	
	public Pessoa (String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}	
	
	public void ConsutarNome  () {
		System.out.println("A pessoa consultada se chama: " + this.nome + " - Data de nascimento: "+ this.dataNascimento);
		
	}
}
