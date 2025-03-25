package br.pucrs;

import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        Random random = new Random();

        int[] vetor15bits = new int[322048];
        for (int i = 0; i < 322048; i++) {
            vetor15bits[i] = random.nextInt();
        }

        int[] vetor20bits = new int[1048576];
        for (int i = 0; i < 1048576; i++) {
            vetor20bits[i] = random.nextInt();

        }

        System.out.println("Vetor de 15 bits - Merge Sort:");
        MergeSort mergeSort15bits = new MergeSort();
        long aux = System.currentTimeMillis();
        int[] vetor1 = vetor15bits;
        mergeSort15bits.sort(vetor1);
        System.out.printf("     ");
        System.out.println(System.currentTimeMillis() - aux + " milisegundos");
        System.out.printf("     ");
        System.out.println(mergeSort15bits.iteracoes + " iterações");

        System.out.println("Vetor de 20 bits - Merge Sort:");
        MergeSort mergeSort20bits = new MergeSort();
        aux = System.currentTimeMillis();
        int[] vetor2 = vetor15bits;
        mergeSort20bits.sort(vetor2);
        System.out.print("     ");
        System.out.println(System.currentTimeMillis() - aux + " milisegundos");
        System.out.printf("     ");
        System.out.println(mergeSort20bits.iteracoes + " iterações");

        System.out.println("Vetor de 15 bits - Max sem divisão:");
        MaxNoDiv maxNoDiv15 = new MaxNoDiv();
        aux = System.currentTimeMillis();
        int[] vetor3 = vetor15bits;
        maxNoDiv15.maxFind(vetor3);
        System.out.print("     ");
        System.out.println(System.currentTimeMillis() - aux + " milisegundos");
        System.out.print("     ");
        System.out.println(322048 + " iterações");

        System.out.println("Vetor de 20 bits - Max sem divisão:");
        MaxNoDiv maxNoDiv20 = new MaxNoDiv();
        aux = System.currentTimeMillis();
        int[] vetor4 = vetor15bits;
        maxNoDiv20.maxFind(vetor4);
        System.out.print("     ");
        System.out.println(System.currentTimeMillis() - aux + " milisegundos");
        System.out.print("     ");
        System.out.println(1048576 + " iterações");

        System.out.println("Vetor de 15 bits - Max com divisão:");
        MaxDiv maxDiv15 = new MaxDiv();
        aux = System.currentTimeMillis();
        int[] vetor5 = vetor15bits;
        maxDiv15.maxDiv(vetor5,0,vetor5.length-1);
        System.out.print("     ");
        System.out.println(System.currentTimeMillis() - aux + " milisegundos");

        System.out.println("Vetor de 20 bits - Max com divisão:");
        MaxDiv maxDiv20 = new MaxDiv();
        aux = System.currentTimeMillis();
        int[] vetor6 = vetor15bits;
        maxDiv20.maxDiv(vetor6,0,vetor6.length-1);
        System.out.print("     ");
        System.out.println(System.currentTimeMillis() - aux + " milisegundos");
    }

}
