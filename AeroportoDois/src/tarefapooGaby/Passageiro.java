package tarefapooGaby;

public class Passageiro extends Pessoa {
	String assento;
	String passaporte;
	String passagem;

	Passageiro[] passageiros = new Passageiro[2];

	public Passageiro(String nome, int idade, String passaporte, String passagem) {
		super(nome, idade);

		this.passaporte = passaporte;
		this.passagem = passagem;
		this.nome = nome;

	}

	public void FazerCheckin() {
		System.out.println("O passageiro: " + this.nome + " Passaporte: " + this.passaporte + " Passagem: "
				+ this.passagem + " Esta fazendo Check-in");

	}
}
