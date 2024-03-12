public class MainPilha {
    public static void main(String[] args) {
        pilha p = new pilha();

        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);

        while (!p.isEmpty()) {
            int elemento = p.pop();
            System.out.println("Desemilhei " + elemento);
        }
        int e = p.pop();
    }
}
