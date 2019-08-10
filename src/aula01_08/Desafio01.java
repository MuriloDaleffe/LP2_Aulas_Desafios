package aula01_08;

import java.util.Random;

public class Desafio01 {
    private int[][] matriz;
    private int[] vetor;
    private int max = 26, num = 5, aux;
    private boolean gen = false;
    Random numAl = new Random();

    public Desafio01() {
        long tempoInicial = System.nanoTime();
        vetor = new int[max];
        matriz = new int[num][num];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                while (gen == false) {
                    aux = numAl.nextInt(max);
                    if (vetor[aux] >= 0) {
                        matriz[i][j] = vetor[aux];
                        vetor[aux] = -1;
                        gen = true;
                    }
                }
                gen = false;
            }
        }
        long tempoFinal = System.nanoTime();
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Tempo total(ns):");
        System.out.println(tempoFinal - tempoInicial);
    }

    public static void main(String[] args) {

        new Desafio01();
    }
