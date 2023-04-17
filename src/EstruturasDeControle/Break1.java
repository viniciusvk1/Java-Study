package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Break1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim");

        sc.close();
    }
}