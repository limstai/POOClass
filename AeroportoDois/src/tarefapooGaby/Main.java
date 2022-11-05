package tarefapooGaby;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Gaby", 19);
		p.Chegar();

		Passageiro passageiros1 = new Passageiro("Tina", 0, "TSA22", "Paris");
		Passageiro passageiros2 = new Passageiro("Gabrielly", 0, "GHB18", "Maldivas");
		Passageiro passageiros3 = new Passageiro("Paula", 0, "PLSA28", "Portugal");
		passageiros1.FazerCheckin();
		passageiros2.FazerCheckin();
		passageiros3.FazerCheckin();
		
		Piloto piloto = new Piloto("Marcos", 0, "PLA", "CTT PLA", 7);
		piloto.Pilotar();
		
		Aeroporto aero = new Aeroporto("Guarulhos", 35);
		aero.Lotacao();

	}

}
