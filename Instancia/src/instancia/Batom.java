package instancia;

public class Batom {
	String marca;
	String cor;
	String tipo;
	String tamanho;
	double preco;
	
	void Passar() { //batom
		System.out.println("O batom da cor " +cor+ " da marca " +marca+ " serve para passar nas bochechas como blush."  );
	}
	
	void Pintar() { //liptint
		System.out.println("O batom do tipo " +tipo+ " da cor " +cor+ " pinta melhor os lábios.");
		
	}
	void Proteger () { //manteigaDeCacau
		System.out.println("O batom de " +tipo+ " da marca " +marca+ " protege melhor os lábios.");
	}
}
