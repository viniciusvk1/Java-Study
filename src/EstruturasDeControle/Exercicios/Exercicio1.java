package EstruturasDeControle.Exercicios;

import java.util.Locale;
import java.util.Scanner;


// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;


public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0 && valor >= 0 && valor <= 10) {
            System.out.println("Par e esta entre 0 e 10");
        } else {
            System.out.println("Impar ou nao esta entre 0 e 10");
        }

        sc.close();
    }
}
