package instancia;

public class Pincel {
	String marca;
	String cor;
	String tipo;
	String tamanho;
	double preco;
	
	void Pintar() { //oval
		System.out.println("O pincel " +tipo+ " é da marca "+marca+ " e serve para pinta os olhos.");
	}
	void Desenhar() { //achatado
		System.out.println("O pincel " +tipo+ " da cor " +cor+ " serve para fazer o desenho do contorno.");
	}
	void Aplicar() { //blush
		System.out.println("O pincel de " +tipo+ " da marca " +marca+ " tem o preço de " +preco+ " e aplica melhor o produto.");
	}
}
