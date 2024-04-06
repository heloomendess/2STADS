import java.util.Scanner;

class Piloto  {
    String nome;
    String equipe;
    int idade;
    int numeroKart;
    int pontos;

    public Piloto(String nome, String equipe, int idade, int numeroKart, int pontos) {
        this.nome = nome;
        this.equipe = equipe;
        this.idade = idade;
        this.numeroKart = numeroKart;
        this.pontos = pontos;
    }

   
}

public class CampeonatoKart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Quantos pilotos deseja cadastrar?");
        int quantidadePilotos = scanner.nextInt();
        scanner.nextLine(); 

        Piloto[] pilotos = new Piloto[quantidadePilotos];

        for (int i = 0; i < quantidadePilotos; i++) {
            System.out.println("Piloto #" + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Equipe: ");
            String equipe = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Número do Kart: ");
            int numeroKart = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Pontos: ");
            int pontos = scanner.nextInt();
            scanner.nextLine(); 

            pilotos[i] = new Piloto(nome, equipe, idade, numeroKart, pontos);
        }


        for (int i = 0; i < pilotos.length - 1; i++) {
            for (int j = i + 1; j < pilotos.length; j++) {
                if (pilotos[i].pontos > pilotos[j].pontos) {
                    Piloto temp = pilotos[i];
                    pilotos[i] = pilotos[j];
                    pilotos[j] = temp;
                }
            }
        }


        System.out.println("ordenados por sua pontuação:");
        for (Piloto piloto : pilotos) {
            System.out.println(piloto.nome);
        }


        System.out.println("Digite o nome do piloto que você deseja pesquisar:");
        String nomePesquisa = scanner.nextLine();
        int idPosicao = pesquisaBinaria(pilotos, nomePesquisa);
        if (idPosicao >= 0) {
            System.out.println("Piloto encontrado na posição " + idPosicao);
        } else {
            System.out.println("Piloto não encontrado.");
        }


        System.out.println("Digite o nome do piloto para excluir:");
        nomePesquisa = scanner.nextLine();
        Piloto[] novoArray = new Piloto[pilotos.length - 1];
        int contador = 0;
        for (Piloto piloto : pilotos) {
            if (!piloto.nome.equals(nomePesquisa)) {
                novoArray[contador++] = piloto;
            }
        }
        pilotos = novoArray;


        System.out.println("Pilotos após exclusão:");
        for (Piloto piloto : pilotos) {
            System.out.println(piloto.nome);
        }

        scanner.close();
    }


    public static int pesquisaBinaria(Piloto[] pilotos, String nome) {
        int inicio = 0;
        int fim = pilotos.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (pilotos[meio].nome.equals(nome)) {
                return meio;
            } else if (pilotos[meio].nome.compareTo(nome) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
