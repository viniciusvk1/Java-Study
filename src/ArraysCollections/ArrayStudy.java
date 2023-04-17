package ArraysCollections;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ArrayStudy {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       double[] notasAluno = new double[3];

        System.out.println(Arrays.toString(notasAluno));

        notasAluno[0] = 7.9;
        notasAluno[0] = 8;
        notasAluno[0] = 6.7;

        System.out.println(Arrays.toString(notasAluno));

        double total = 0;
        for(int i = 0; i < notasAluno.length; i++){
            total += notasAluno[i];
        }

        double media = total / notasAluno.length;

        System.out.printf("%.2f",media);

        sc.close();
    }
}
