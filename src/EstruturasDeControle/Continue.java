package EstruturasDeControle;

public class Continue {
    public static void main(String[] args) {
// Numeros Impares
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }


        System.out.println();

// Numeros Pares
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }


    }
}
