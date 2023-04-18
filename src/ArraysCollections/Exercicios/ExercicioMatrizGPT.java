package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// Escreva um programa Java que crie uma matriz 3x3 de inteiros e preencha-a com valores fornecidos pelo usuário.
// Em seguida, o programa deve exibir na tela os elementos da matriz, organizados em linhas separadas.

public class ExercicioMatrizGPT {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] inteiros = new int[3][3];

        for (int i = 0; i < inteiros.length; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.printf("\nDigite um valor para a posicao (%d,%d) da matriz: ", i, j);
                inteiros[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < inteiros.length ; i++) {
            for (int j = 0; j < inteiros[i].length; j++) {
                System.out.println(inteiros[i][j] + " ");
            }
        }

        sc.close();
    }
}
