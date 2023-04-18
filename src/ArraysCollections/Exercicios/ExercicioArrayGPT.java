package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Escreva um programa Java que crie um array de inteiros com tamanho 10 e preencha-o com números inteiros fornecidos pelo usuário.
// Em seguida, o programa deve exibir a soma dos números pares no array.
// Dica: utilize o operador módulo (%) para determinar se um número é par ou não.

public class ExercicioArrayGPT {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando a Array com tamanho = 10.
        int[] numeros = new int[10];

        //Criando variavel para receber a soma dos pares
        int soma = 0;

        // Adicionando valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite um numero na posicao %d da array: ", i);
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }

        System.out.println("A soma dos valores pares e: " + soma);

        sc.close();
    }
}
