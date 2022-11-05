package instancia;

public class Pote {
	String marca;
	String cor;
	String tipo;
	String tamanho;
	double preco;	//vidro armazena -
	
	void armazenar() {
		System.out.println("O pote de " +tipo+ " da cor " +cor+ " armazena as maquiagens e custa " +preco);
		
	}				//acrilico
	
	void organizar () {
		System.out.println("O pote de " +tipo+ " da cor " +cor+ " é da marca " +marca+ ", e serve pra organizar as maquiagens.");
		
	}
					//plastico
	void proteger () {
		System.out.println("O pote de "+tipo+ " da cor " +cor+ " tem o tamanho de " +tamanho+ " e ajuda a proteger os pincéis.");
	}
}
