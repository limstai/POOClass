package tarefaPoo8;

public class Piloto extends Pessoa {
	String habilitacao;
	String licenca;

	public Piloto(String nome, String licenca, String habilitacao) {
		super(nome, nome);
		this.habilitacao = habilitacao;
		this.licenca = licenca;
		this.nome = nome;

	}

	public void Pilotar() {
		System.out.println("O piloto: " + this.nome + " - Licença: " + this.licenca + " - Habilitação: " + this.habilitacao
				+ " .Pode pilotar!");
	}
}
