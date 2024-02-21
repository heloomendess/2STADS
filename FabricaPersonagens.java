package rpgsenac;

public class FabricaPersonagens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		personagem p1 = new personagem();
		p1.setNome("Arnaldo");
		
		personagem p2 = new personagem("Edmundo");
		
		System.out.println("p1 - " + p1.getNome());
		System.out.println("p2 - " + p2.getNome());
		
		p2.atacar();
		p2.atacar();

		System.out.println("XP - " + p2.getXP());
		
		System.out.println(personagem.getMarca());
		
		personagem.marca;
	}

}
