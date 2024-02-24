/*
 * - uma matriz tem duas dimensoes (linhas e colunas)
 * - é um conjunto de variaveis com mais de uma dimensão ao contrario dos vetores que tem só uma dimensão
 * - uma matriz de 2 linhas e 2 colunas seria declarada assim:
 *      int [][] numeros = new int [2]linhas [2]colunas;
 * - \t (da um tab)
 * - array.lenght = pega o tamanho do vetor/matriz
 * - a quantidade de colunas nunca vai mudar; mas o de linhas é muito relativo e pode mudar a qualquer momento
 *
 *
 * ex.1
 * - Elaborar um programa em Java que faça uma matriz 3x3 de números inteiros digitados pelo usuário. Exibir a matriz, somar os elementos da diagonal e exibir a soma.
 */

import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] numeros = new int [3][3];

        System.out.println("Matriz [3][3]");

        for(int l = 0; l < 3; l++) {
            for(int c = 0; c < 3; c++) {
                System.out.printf("Insira o número [%d] [%d]: ", l+1, c+1);
                numeros [l][c] = input.nextInt();
            }
        }

        System.out.printf("\n A matriz ficou: \n" );
        for(int l = 0; l < 3; l++) {
            System.out.println("\n");
            for(int c = 0; c < 3; c++) {
                System.out.printf("\t %d \t", numeros[l][c]);
            }
        }
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i][i];
        }

        System.out.println("\n A soma é: " + soma);

    }

}