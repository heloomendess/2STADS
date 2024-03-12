public class desafio2EstacionamentoAP2 {
    String[][] vagas;
    int[] topo;

    public desafio2EstacionamentoAP2() {
        vagas = new String[9][3];
        topo = new int[9];
    }

    public void estacionarVeiculo(String veiculo, int fila) {
        if (!isFull(fila)) {
            int top = topo[fila - 1];
            vagas[fila - 1][top] = veiculo;
            topo[fila - 1]++;
            System.out.println("Veículo '" + veiculo + "' estacionado na fila " + fila);
        } else {
            System.out.println("Fila " + fila + " está cheia. Não é possível estacionar o veículo.");
        }
    }

    public void retirarVeiculo(int fila) {
        if (!isEmpty(fila)) {
            int top = topo[fila - 1] - 1;
            String veiculoRetirado = vagas[fila - 1][top];
            vagas[fila - 1][top] = null;
            topo[fila - 1]--;
            System.out.println("Veículo '" + veiculoRetirado + "' retirado da fila " + fila);
        } else {
            System.out.println("Fila " + fila + " está vazia. Nenhum veículo para retirar.");
        }
    }

    public boolean isEmpty(int fila) {
        return topo[fila - 1] == 0;
    }

    public boolean isFull(int fila) {
        return topo[fila - 1] == 3;

    }

    public static void main(String[] args) {
        desafio2EstacionamentoAP2 estacionamento = new desafio2EstacionamentoAP2();

        estacionamento.estacionarVeiculo("Carro1", 1);
        estacionamento.estacionarVeiculo("Moto1", 2);
        estacionamento.estacionarVeiculo("Caminhao1", 3);

        estacionamento.retirarVeiculo(1);
        estacionamento.retirarVeiculo(2);
        estacionamento.retirarVeiculo(3);
        estacionamento.retirarVeiculo(1); // Tentativa de retirar veículo de fila vazia
    }
}

