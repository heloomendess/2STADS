import  java.util.Scanner;

public class BubbleSortEx1 {
    static String nomes[] = {"Maria", "Sandra", "André", "Mario", "Dirce", "Sandro"};

    public static void main(String[] args) {
        bsort(nomes, nomes.length);

        System.out.println("\nNomes ordenados em ordem alfabética crescente: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    static void bsort(String v[], int tam) {
        int i, j;
        String k;

        for (i = 1; i < tam; i++) {
            for (j = 0; j < tam - i; j++) {
                if (v[j].compareTo(v[j + 1]) > 0) {
                    k = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = k;
                }
            }
        }
    }
}
