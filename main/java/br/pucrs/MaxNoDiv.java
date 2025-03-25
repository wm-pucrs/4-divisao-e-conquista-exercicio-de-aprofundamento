package br.pucrs;

public class MaxNoDiv {
    long maxFind(int A[]) {
        int max = A[0];
        for (int i = 1; i < A.length - 1; i++) {
            if( A[i] > max )
                max = A[i];
        }
        return max;
    }
}
