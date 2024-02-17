import java.util.Scanner;

//Ler um vetor Q de 10 posições (aceitar somente números
//positivos). Mostr a seguir o valor do maior elemento de Q e a
//respectiva posição que ele ocupa no vetor
public class ex3Aula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho = 10;
        double[] vetorQ = new double[tamanho];

        for(int i=0; i < tamanho; i++) {
            do { 
                System.out.println("Digite um numero positivo " + (i + 1) + ":");
                vetorQ[i] = input.nextInt();
            } while (vetorQ[i] < 0);
        }
        double maiorElemento = vetorQ[0];
        int posicaoMaior = 0;

        for(int i =0; i < tamanho; i++) {
            if (vetorQ[i] > maiorElemento) {
                maiorElemento = vetorQ[i];
               posicaoMaior = i;
            }
        }
        System.out.println("Maior valor " + maiorElemento);
        System.out.println("Posição maior " + posicaoMaior);
    }
}
