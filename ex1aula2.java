import java.util.Scanner;

public class ex1aula2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] nomes = new String[3];

        for(int i=0; i<3; i++) {
            System.out.println("Digite o nome da pessoa " + (i+1) + ":");
            nomes[i] = input.nextLine();
        }
        System.out.println("Digite mais um nome: ");
        String nomesearch = input.nextLine();

        boolean find = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomesearch)) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}
