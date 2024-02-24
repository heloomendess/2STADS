/*
- Exercicio 2
* Elaborar um programa em Java para criar uma matriz 3x4, para o usuário preencher com números inteiros. Depois, exibir a matriz, mostrar quantos números ímpares existem, e quais são
eles.

* */

import java.util.Scanner;

public class aula3ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matriz [][] = new int [3][4];

        System.out.println("Matriz [3][4]");

        for(int l = 0; l < 3; l++) {
            for(int c = 0; c < 4; c++) {
                System.out.printf("Insira o número [%d] [%d]: ", l+1, c+1);
                matriz [l][c] = input.nextInt();
            }
        }

        System.out.printf("\n A matriz ficou: \n" );
        for(int l = 0; l < 3; l++) {
            System.out.println("\n");
            for(int c = 0; c < 4; c++) {
                System.out.printf("\t %d \t", matriz[l][c]);
            }
        }
        System.out.println("\n");
        for(int l = 0; l < 3; l++) {
            System.out.println("\n");
            for(int c = 0; c < 4; c++) {
                if(matriz[l][c] %2 == 1){
                    System.out.printf("\t %d \t", matriz[l][c]);
                }
            }
        }
    }
}
