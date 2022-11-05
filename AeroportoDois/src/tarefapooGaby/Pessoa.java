package tarefapooGaby;

public class Pessoa {
	String nome;
	int idade;
	double peso;

	public Pessoa(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;

	}

	public void Chegar() {
		System.out.println("A pessoa: " + this.nome + " possui " + this.idade + " anos");

	}

}
