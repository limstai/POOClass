package tarefaPoo8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Paula", "28 de Maio 1974");
		p.ConsutarNome();
		
		Piloto pilotos = new Piloto("Andre", "PLA", "CCT PLA");
		pilotos.Pilotar();

		Passageiro passageiros = new Passageiro("Taina", "RG:23.344.343-2", "7G");
		passageiros.Embarcar();
		
		Aeroporto aero = new Aeroporto("Guarulhos", "Paris");
		aero.ReceberVoos();
		
		Aeronave aeronave = new Aeronave("LATAM", "200", "Guarulhos");
		aeronave.Pousar();
	}

}
