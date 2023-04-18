package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// Escreva um programa Java que crie um array de inteiros com os valores de 1 a 10.
// Em seguida, o programa deve usar um loop foreach para exibir na tela a tabuada de cada um dos elementos da array,
// ou seja, os resultados da multiplicação de cada número da array pelos números de 1 a 10.

public class ExercicioForeachGPT2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] inteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numero : inteiros) {
            System.out.println("\nTabuada do " + numero + ": ");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }

        sc.close();
    }
}
