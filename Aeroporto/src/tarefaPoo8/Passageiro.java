package tarefaPoo8;

public class Passageiro extends Pessoa {
	String documento;
	String portao;

	public Passageiro(String nome, String documento, String portao) {
		super(nome, nome);
		this.documento = documento;
		this.portao = portao;
		this.nome = nome;
	}

	public void Embarcar() {
		System.out.println("O Passageiro: " + this.nome + " - Documento: " + this.documento + " - Embarca no portão: "
				+ this.portao);
	}

}
