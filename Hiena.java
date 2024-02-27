public class Hiena {

    private String nomeCientifico;
    private String raca;
    private int tamanho;
    private int expectativaDeVida;

    private int intelig;
    private int destreza;
    private int forca;
    private int vida;
    private int xp;

    public String getNomeCientifico() {
        return this.nomeCientifico.toUpperCase();
    }
    public void setNomeCientifico(String pNomeCientifico) {
        this.nomeCientifico = pNomeCientifico;
    }

    public String getRaca() {
        return this.raca;
    }
    public void setRaca(String pRaca) {
        this.raca = pRaca;
    }

    public int getTamanho() {
        return this.tamanho;
    }
    public void setTamanho(int pTamanho) {
        this.tamanho = pTamanho;
    }

    public int getExpectativaDeVida() {
        return this.expectativaDeVida;
    }
    public void setExpectativaDeVida(int pExpectativaDeVida) {
        this.expectativaDeVida = pExpectativaDeVida;
    }

    public int getXP() {
        return this.xp;
    }
    public void setXP(int pXP) {
        this.xp = pXP;
    }

    void atacar() {
        System.out.println("atacando...");
        xp += 10;
    }

    public Hiena() {
        this.vida = 100;
    }
    public Hiena(String nomeCientifico) {
        this.vida = 100;
        this.nomeCientifico = nomeCientifico;
    }



}
