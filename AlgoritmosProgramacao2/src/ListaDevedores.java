/*
Crie uma lista de devedores que contenha seus nomes, sobrenomes e valores devidos.
Ordene com SelectionSort, indicando o conteúdo da lista no final de cada passo do
algoritmo insertion sort.
 */

//Insertion Sort
public class ListaDevedores {
    public static void main(String[] args) {
        Devedor[] devedores = {
                new Devedor("João", "Silva", 1500.0),
                new Devedor("Maria", "Santos", 1200.0),
                new Devedor("Pedro", "Oliveira", 1800.0),
                new Devedor("Ana", "Souza", 1000.0),
                new Devedor("Carlos", "Ferreira", 2000.0)
        };

        selectionSort(devedores);

        // Imprime o conteúdo da lista após a ordenação
        for (Devedor devedor : devedores) {
            System.out.println(devedor);
        }
    }

    public static void selectionSort(Devedor[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getValorDevido() < arr[minIdx].getValorDevido()) {
                    minIdx = j;
                }
            }

            // Troca o menor elemento com o primeiro elemento não ordenado
            Devedor temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            // Imprime o conteúdo da lista após cada passo da ordenação
            System.out.println("Após passo " + (i + 1) + ":");
            for (Devedor devedor : arr) {
                System.out.println(devedor);
            }
            System.out.println("--------------------------");
        }
    }
}
