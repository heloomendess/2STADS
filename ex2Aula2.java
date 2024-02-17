import java.util.Scanner;

public class ex2Aula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Digite o número de alunos na turma: ");
        int numAlunos = input.nextInt();

        double[] notas = new double[numAlunos];

        for(int i = 0; i < numAlunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = input.nextDouble();
        }

        double somaNotas = 0;
        for(double nota : notas) {
            somaNotas += nota;
        }

        double mediaTurma = somaNotas / numAlunos;

        int acimaDaMedia = 0;
        for(double nota : notas) {
            if(nota > mediaTurma){
                acimaDaMedia++;
            }
        }

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Aluno acima da média: " + acimaDaMedia);
    }
}
