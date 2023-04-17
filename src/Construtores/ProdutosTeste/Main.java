package Construtores.ProdutosTeste;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto("Notebook", 4356.89);

        System.out.println(p1.produtoFormatado());

        sc.close();
    }
}
