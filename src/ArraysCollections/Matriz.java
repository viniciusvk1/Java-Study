package ArraysCollections;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = sc.nextInt();
        System.out.print("Quantas notas? ");
        int qtdeNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a %dª do aluno %d: ", i + 1, j + 1);
                notasDaTurma[i][j] = sc.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("A media da turma e: " + media);

        for (double[] notaDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notaDoAluno));
        }


        sc.close();
    }
}
