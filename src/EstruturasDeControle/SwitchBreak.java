package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String conceito = "";

        System.out.print("Digite sua nota: ");
        int nota = sc.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;

            case 8:
            case 7:
                conceito = "B";
                break;

            case 6:
            case 5:
                conceito = "C";
                break;

            case 4:
            case 3:
                conceito = "D";
                break;

            case 2:
            case 1:
                conceito = "F";
                break;

            default:
                conceito = "Invalido!";

        }

        System.out.printf("O seu conceito e : %s", conceito);

        sc.close();
    }

}