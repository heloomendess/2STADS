/*Crie um algoritmo em Java para estacionar e retirar veiculos automaticamente; no nosso estacionamento só retiramos e colocamos veiculos em uma fila por vez. Dica
Dica: Crie um vetor para cada fila de vagas.
 */

public class estacionamento {
    
    public Object[] vagas;
    
    public int posicaoCarro;
    
    public estacionamento() {
        this.posicaoCarro = -1;
        this.vagas = new Object[5];
    }

    public static void main(String[] args) {
        estacionamento p = new estacionamento();
        p.empilhar("Carro 1");
        p.empilhar("Carro 2");
        p.empilhar("Carro 3");
        p.empilhar("Carro 4");
        p.empilhar("Carro 5");
        
        while (!p.estacionamentoVazio() == false);
    }

    private boolean estacionamentoVazio() {
    }

    private void empilhar(String s) {
    }

}
