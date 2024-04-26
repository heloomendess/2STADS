/*
Considere o seguinte vetor: v = <6, 3, 4, 2, 5, 1>
Indique o conteúdo de v no final de cada passo do algoritmo insertion sort.
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] v = {6, 3, 4, 2, 5, 1};

        insertionSort(v);

        // Imprime o vetor após cada passo da ordenação
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos de arr[0..i-1] que são maiores que a chave para uma posição à frente de sua posição atual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Imprime o conteúdo da lista após cada passo da ordenação
            System.out.println("Após passo " + i + ":");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
