public class SelectionSort {

    public static void main(String[] args) {
        int[] v = {6, 3, 4, 2, 5, 1};

        selectionSort(v);

        // Imprime o vetor após a ordenação
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Troca o menor elemento com o primeiro elemento não ordenado
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}

