public class pilha {

    int elementos[]; //estrutura que vai armazenar os elementos da minha pilha
    int topo; //controla qual posição estou apontando; indica o ultimo elemento armazenado

    public pilha() { //construtor; quem vai fazer toda a inicialização
        elementos = new int[10]; //cabem 10 elementos do tipo int; tamanho limitado
        topo = -1; //necessário deixar o topo apontando para uma posição inválida do vetor
    }
    public void push(int e) { //empilhar
        if (isFull()) {
            throw new RuntimeException("Stack Overflow!"); //a pilha está cheia; sinaliza quando uma operação não dá certo
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop() { //desempilhar
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!"); //a pilha está vazia; sinaliza quando uma operação não dá certo
        }
        int e;
        e = elementos[topo]; //o int e vai receber o que está no topo
        topo--;
        return e;
    }

    public boolean isEmpty() { //verificar se está vazia
        if(topo == -1) {
            return true;
        }
        return false;

    }
    public boolean isFull() { //verificar se está cheia
        if (topo == 9) {
            return true;
        }
        return false;
    }
    public int top() { //retornar um valor do topo pra mim
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!"); //a pilha está vazia; sinaliza quando uma operação não dá certo
        }
        return elementos[topo];
    }
}
