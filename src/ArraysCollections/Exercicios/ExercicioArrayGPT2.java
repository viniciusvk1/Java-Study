package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

//Escreva um programa Java que crie um array de strings com tamanho 5 e preencha-o com nomes fornecidos pelo usuário.
// Em seguida, o programa deve exibir todos os nomes em ordem inversa.

public class ExercicioArrayGPT2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        System.out.println("Adicionando nomes a Array");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite um nome para a posicao %d da array: ", i);
            nomes[i] = sc.nextLine();
        }

        System.out.println("Todos os nomes foram inseridos!");
        System.out.println("Mostrando os nomes de forma inversa do que foram inseridos: ");

        System.out.println();
        for (int i = nomes.length - 1; i >= 0; i--){
            System.out.println(nomes[i]);
        }


        sc.close();
    }
}
