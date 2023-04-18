package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Crie um programa Java que permita ao usuário criar uma matriz de números inteiros
// com tamanho personalizado (quantidade de linhas e colunas) e,
// em seguida, exiba a soma de todos os elementos da matriz.
public class ExercicioMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.print("Quantas linhas deseja criar? ");
        int quantidadeNumeros1 = sc.nextInt(); // i - instanciando a quantidade de linhas
        System.out.print("Quantas colunas devem ser criadas? ");
        int quantidadeNumeros2 = sc.nextInt(); // j - instanciando a quantidade de colunas
        System.out.println("===============================");

        int[][] matriz = new int[quantidadeNumeros1][quantidadeNumeros2]; // criando a matriz

        // Inicializando os dados na matriz

        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("\nDigite o %dº numero da %dª posicao: ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println(soma);

            sc.close();
    }

}
