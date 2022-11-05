package tarefapooGaby;

public class Aeroporto {
	String local;
	int lotacao;

	public Aeroporto(String local, int lotacao) {
		this.local = local;
		this.lotacao = lotacao;

	}

	public void Lotacao() {
		System.out.println("Aeroporto de " + this.local + " está com " + this.lotacao + "% de sua lotação máxima");
	}

}
