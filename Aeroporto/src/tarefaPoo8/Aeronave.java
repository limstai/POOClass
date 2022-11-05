package tarefaPoo8;

public class Aeronave extends Aeroporto{
	String modelo;
	String capacidade;
	String fabricante;

	public Aeronave (String modelo, String capacidade, String nome) {
		super(nome, nome);
		this.modelo = modelo;
		this.capacidade = capacidade;

	}

	public void Pousar() {
		System.out.println("A Aeronave "+this.modelo + " com cerca de: " +this.capacidade+ " de passageiros, acaba "
				+ "de pousar no  aeroporto: " +this.nome);
	}
}
