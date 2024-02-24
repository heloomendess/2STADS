/*
- Urna Eletronica
Crie uma urna eletronica que armazene os votos a prefeitura de SP em 2024. Ao termino da votação, deve ser exibido o resultado em ordem decrescente. Use uma matriz
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class urnaEletronica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] candidatos = {"Guilherme Boulos (PSOL)", "Kim Kataguiri (UB)", "Marco Vinholi (PSDB)", "Marina Helena (NOVO)", "Ricardo Nunes (MDB)", "Ricardo Salles (PL)", "Tabata Amaral (PSB)"};
        int[][] votos = new int[candidatos.length][1];

        System.out.println("Votação para candidatos a prefeitura de 2024: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Eleitor " + (i+1) + ":");
            exibirCandidatos(candidatos);

            int voto = input.nextInt();
            if (voto >= 1 && voto <= candidatos.length) {
                votos[voto - 1][0]++;
                System.out.println("Voto registrado para " + candidatos[voto - 1]);
            } else {
                System.out.println("Opção invalida, voto não registrado");
            }
        }

    }

    private static void exibirCandidatos(String[] candidatos) {
        System.out.println("Escolha o número do candidato: ");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println((i + 1) + ". " + candidatos[i]);
        }
    }
    private static void exibirResultados(String[] candidatos, int[][] votos) {
        int[][] resultadosOrdenados = Arrays.copyOf(votos, votos.length);

        Arrays.sort(resultadosOrdenados, (a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < resultadosOrdenados.length; i++) {
            System.out.println(candidatos[i] + ":" + resultadosOrdenados[i][0] + "votos");
        }
    }
}
