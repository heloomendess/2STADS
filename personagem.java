package rpgsenac;

public class personagem {
	
	// variavel da class
	private static String marca = "RPGSENAC";
	
	// variavel da instancia
	private String nome;
	private String raca;
	private String classe;
	
	private int intelig;
	private int destreza;
	private int forca;
	private int vida; 
	private int xp;
	private int stamina;
	
	public static String getMarca() {
		return marca;
	}
	// metodo acessor/ modificador - getter and setters
	
	public String getNome() {
		return this.nome.toUpperCase();
	}
	
	public void setNome(String pNome) {
		this.nome = pNome;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int pVida) {
		this.vida = pVida;
	}
	
	public int getXP() {
		return this.xp;
	}
	
	public void setXP(int pXP) {
		this.xp = pXP;
	}
	
	//metodos
	
	void atacar() {
		System.out.println("atacando...");
		xp += 10;
	}
	
	private String getRaca() {
		return raca;
	}

	private void setRaca(String raca) {
		this.raca = raca;
	}

	private String getClasse() {
		return classe;
	}

	private void setClasse(String classe) {
		this.classe = classe;
	}

	private int getIntelig() {
		return intelig;
	}

	private void setIntelig(int intelig) {
		this.intelig = intelig;
	}

	private int getDestreza() {
		return destreza;
	}

	private void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	private int getForca() {
		return forca;
	}

	private void setForca(int forca) {
		this.forca = forca;
	}

	private int getXp() {
		return xp;
	}

	private void setXp(int xp) {
		this.xp = xp;
	}

	private int getStamina() {
		return stamina;
	}

	private void setStamina(int stamina) {
		this.stamina = stamina;
	}

	// construtores 
	public personagem() {
		this.vida = 100;
	}
	public personagem(String nome) {
		this.vida = 100;
		this.nome = nome;
	}
}
