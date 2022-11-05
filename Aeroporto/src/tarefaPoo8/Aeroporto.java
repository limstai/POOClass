package tarefaPoo8;

public class Aeroporto {
	String nome;
	String cidade;
	String pais;
	
	public Aeroporto (String nome, String pais) {
		this.nome = nome;
		this.pais = pais;
		
	}
	
	public void ReceberVoos () {
		System.out.println("O Aeroporto de: " +this.nome+ " recebeu voos de: " + this.pais);
	}
}
