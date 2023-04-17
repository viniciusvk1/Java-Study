package ArraysCollections.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.print("Digite primeiramente a quantidade de notas do aluno que serao inseridas: ");
        int quantidadeNotas = sc.nextInt();

        double[] notasAluno = new double[quantidadeNotas];
        System.out.println("==============================");
        System.out.printf("Agora digite os valores referentes a quantidade de %d notas definidas", notasAluno.length);
        System.out.println("==============================");

        for (int i = 0; i < notasAluno.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª: " );
            notasAluno[i] = sc.nextDouble();
            System.out.println("==============================");
        }

        double total = 0;
        for(double nota: notasAluno){
            total += nota;
    }
        double media = total / notasAluno.length;

        System.out.printf("A media total do aluno foi de: %.1f",media);

        sc.close();
    }
}