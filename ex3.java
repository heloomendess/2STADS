import java.util.Scanner; 

public class ex3 {
    public static void main(String[] args) {   
    
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int n1 = input.nextInt();

    System.out.println("Digite outro número: ");
    int n2 = input.nextInt();

    int resultado = calcular(n1, n2);

    System.out.println("O resto da divisão é " + resultado);
    
 }
    static int calcular(int n1, int n2) {
        return n1 % n2;
    }
}
