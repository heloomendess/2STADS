public class fabricaHiena {
    public static void main(String[] args) {

        Hiena h1 = new Hiena();
        h1.setNomeCientifico("Hyaenidae");

        Hiena h2 = new Hiena();
        h2.setExpectativaDeVida(12);

        System.out.println("Nome Cientifico da Hiena: " + h1.getNomeCientifico());

        System.out.println("Uma hiena tem a expectativa de vida de " +h2.getExpectativaDeVida() + " anos.");

        h1.atacar();

    }
}
