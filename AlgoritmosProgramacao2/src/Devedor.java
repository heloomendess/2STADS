/*
Crie uma lista de devedores que contenha seus nomes, sobrenomes e valores devidos.
Ordene com SelectionSort, indicando o conteúdo da lista no final de cada passo do
algoritmo insertion sort.
 */

//Insertion Sort
public class Devedor {
    private String nome;
    private String sobrenome;
    private double valorDevido;

    public Devedor(String nome, String sobrenome, double valorDevido) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.valorDevido = valorDevido;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " - Valor Devido: R$" + valorDevido;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(double valorDevido) {
        this.valorDevido = valorDevido;
    }
}

