package EstruturasDeControle.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// 2. Criar um programa informa se o ano atual é um ano bissexto;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Que ano voce esta pensando? ");
        int ano = sc.nextInt();

        System.out.println("Quantos dias tem esse ano? ");
        int dias = sc.nextInt();

        if (dias == 366) {
            System.out.printf("O ano %d tem %d dias e tambem e um ano bissexto!", ano, dias);
        } else {
            System.out.printf("O ano %d tem %d dias e nao e um ano bissexto!", ano, dias);
        }

        sc.close();
    }
}