package ArraysCollections.EqualsHashCodeStudy;

import java.util.Locale;
import java.util.Scanner;

public class EqualsHashCode {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Usuario u1 = new Usuario();
        u1.nome = "Vinicius Almeida";
        u1.email = "viniciusalmeida@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Camile Righetti";
        u2.email = "camilerighetti@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));



        sc.close();
    }
}
