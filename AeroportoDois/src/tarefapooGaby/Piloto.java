package tarefapooGaby;

public class Piloto extends Pessoa {
	int civ;
	String habilitacao;
	String licenca;

	public Piloto(String nome, int idade, String licenca, String habilitacao, int civ) {
		super(nome, idade);
		this.habilitacao = habilitacao;
		this.licenca = licenca;
		this.nome = nome;
		this.civ = civ;
	}

	public void Pilotar() {
		System.out.println("O piloto: " + this.nome + " - Licen�a: " + this.licenca + " - Habilita��o: "
				+ this.habilitacao + " e de CIV: " + this.civ + ". Pode pilotar!");
	}
}
