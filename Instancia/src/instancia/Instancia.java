package instancia;

public class Instancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pote vidro = new Pote();
		vidro.marca = "Invicta";
		vidro.cor = "rosa";
		vidro.tipo = "vidro";
		vidro.preco = 20.00;
		vidro.tamanho = "10 CM";
		
		Pote acrilico = new Pote();
		acrilico.marca = "Acrilmax";
		acrilico.cor = "azul";
		acrilico.tamanho = "15 CM";
		acrilico.tipo = "acrilico";
		acrilico.preco = 20.00;
		
		Pote plastico = new Pote();
		plastico.marca = "Tupperware";
		plastico.cor = "roxo";
		plastico.tamanho = "15 CM";
		plastico.tipo = "plástico";
		plastico.preco = 12.00;
		
		Batom batom = new Batom();
		batom.marca = "Vult";
		batom.cor = "vermelho";
		batom.tipo = "batom";
		batom.tamanho = "3 CM";
		batom.preco = 9.00;
		
		Batom liptint = new Batom();
		liptint.marca = "Vult";
		liptint.cor = "rosa";
		liptint.tipo = "liptint";
		liptint.tamanho = "5 CM";
		liptint.preco = 15.00;
		
		Batom manteigaCacau = new Batom();
		manteigaCacau.marca = "Vult";
		manteigaCacau.cor = "brilho";
		manteigaCacau.tipo = "manteiga de Cacau";
		manteigaCacau.tamanho = "5 CM";
		manteigaCacau.preco = 10.00;
		
		Pincel oval = new Pincel();
		oval.marca = "Avon";
		oval.cor = "preto";
		oval.tipo = "oval";
		oval.tamanho = "10 CM";
		oval.preco = 20.00;
		
		Pincel achatado = new Pincel();
		achatado.marca = "Avon";
		achatado.cor= "rosa";
		achatado.tipo = "achatado";
		achatado.tamanho = "10 CM";
		achatado.preco = 20.00;
		
		Pincel blush = new Pincel();
		blush.marca = "Avon";
		blush.cor = "azul";
		blush.tipo = "Blush";
		blush.tamanho = "10 cm";
		blush.preco= 20.00;
		
		vidro.armazenar();
		acrilico.organizar();
		plastico.proteger();
		batom.Passar();
		liptint.Pintar();
		manteigaCacau.Proteger();
		oval.Pintar();
		achatado.Desenhar();
		blush.Aplicar();
		
		
	}

}
