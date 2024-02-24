/*
* Elaborar um programa em Java que crie uma matriz 5x4 onde serão armazenadas notas (valores reais) digitados pelo usuário. Depois, exibir a matriz, verificar quantas notas são
maiores ou igual a 7, o que refere-se aos alunos aprovados, e quantas são menores que 7. então exibir na tela quantos alunos estão aprovados e quantos estão reprovados.
* */
import java.util.Scanner;
public class aula3ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matriz [][] = new int [5][4];

        System.out.println("Matriz [5][4]");

        for(int l = 0; l < 5; l++) {
            for(int c = 0; c < 4; c++) {
                System.out.printf("Insira o número [%d] [%d]: ", l+1, c+1);
                matriz [l][c] = input.nextInt();
            }
        }

        System.out.printf("\n A matriz ficou: \n" );
        for(int l = 0; l < 5; l++) {
            System.out.println("\n");
            for(int c = 0; c < 4; c++) {
                System.out.printf("\t %d \t", matriz[l][c]);
            }
        }
    }
}
