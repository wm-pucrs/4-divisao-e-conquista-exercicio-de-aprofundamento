package br.pucrs;

import static java.lang.Math.max;

public class MaxDiv {
    int iteracoes = 0;
    long maxDiv(int A[], int init, int end) {
        if (end - init <= 1)
            return max(A[init], A[end]);
        else {
            int m = (init + end)/2;
            long v1 = maxDiv(A,init,m);
            long v2 = maxDiv(A,m+1,end);
            return max(v1,v2);
        }
    }
}
