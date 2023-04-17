package Construtores.Exercicios.DesafioConstrutores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Data d1 = new Data();

        var d2 = new Data(17, 11, 2001);

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        sc.close();
    }
}
