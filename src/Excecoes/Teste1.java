package Excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        method2();

    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inicio metodo 2");
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de Imput!");
        }

        System.out.println("Fim do programa!");
        System.out.println("Metodo 2 fim");
        sc.close();
    }

}
