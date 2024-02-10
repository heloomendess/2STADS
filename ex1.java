import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float notas[] = new float[10];
        int i;

        System.out.println("Digite 10 notas: ");
        for(i = 0; i <= 9; i++) {
            notas[i] =input.nextFloat();
        }
        for(i = 0; i <= 9; i++) {
            if ((i == 7) || i == 9) {
                System.out.println("A posição " + "do " + i + " do vetor, contém a nota " + notas[i]);
        }
        }
    }
}