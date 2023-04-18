package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// Escreva um programa Java que solicite ao usuário que informe o tamanho da array de inteiros a ser criada.
// Em seguida, o programa deve preencher a array com números aleatórios gerados pelo computador no intervalo de 1 a 100.
// Em seguida, o programa deve exibir na tela a array completa e a média dos valores presentes na array.

public class ExercicioArrayGPT3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanho da array de inteiros: ");
        int tamanhoArray = sc.nextInt();

        int min = 0;
        int max = 100;

        int[] inteirosAleatorios = new int[tamanhoArray];

        int soma = 0;
        for (int i = 0; i < inteirosAleatorios.length; i++) {
            inteirosAleatorios[i] = random.nextInt(100) + 1;
            soma += inteirosAleatorios[i];
        }

        System.out.println("Array completa:");
        for (int i = 0; i < inteirosAleatorios.length; i++) {
            System.out.println(inteirosAleatorios[i]);
        }

        double media = soma / inteirosAleatorios.length;
        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}
