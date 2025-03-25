package br.pucrs;

public class MergeSort {
    int iteracoes = 0;

    // Método principal que ordena o array usando o Merge Sort
    public void sort(int[] array) {
        iteracoes++;
        if (array.length < 2) {
            return; // Se o array tem menos de 2 elementos, já está ordenado
        }
        int mid = array.length / 2; // Encontra o ponto médio do array

        // Divide o array em duas metades
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copia os dados para os arrays esquerdo e direito
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        // Chama recursivamente o sort para as duas metades
        sort(left);
        sort(right);

        // Mescla as duas metades ordenadas
        merge(array, left, right);
    }

    // Método que mescla duas metades ordenadas
    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Mescla os arrays enquanto houver elementos em ambos
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copia os elementos restantes do array esquerdo, se houver
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copia os elementos restantes do array direito, se houver
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}