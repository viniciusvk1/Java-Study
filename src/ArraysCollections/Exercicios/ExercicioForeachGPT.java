package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Escreva um programa Java que crie um array de strings com os nomes de cinco cores diferentes.
// Em seguida, o programa deve usar um loop foreach para exibir na tela cada um dos elementos da array,
// precedidos pela frase "Minha cor favorita é ".

public class ExercicioForeachGPT {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] cores = {"azul", "verde", "amarelo", "vermelho", "roxo"};

        for (String cor : cores) {
            System.out.printf("\nMinha cor favorita e: %s.", cor);
        }


        sc.close();
    }
}
