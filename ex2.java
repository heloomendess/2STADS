import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        float notas[] = new float[10];

        int i, aprov= 0, reprov= 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as 10 notas do aluno: ");
        
        for(i = 0; i <= 9; i++) {
            notas[i] = input.nextFloat();
            if (notas[i] >= 7) {
                aprov++;
            } else if(notas[i] < 7) {
                reprov++;
            }
        }

        for(i = 0; i <= 9; i++) {
            System.out.println("A posição " + "do " + i + " do vetor, contém a nota " + notas[i]);
        }

        System.out.println(aprov + " estudantes foram aprovados.");
        System.out.println(reprov + " estudantes foram reprovados.");
    }
}
