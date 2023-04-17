package EstruturasDeControle.Exercicios;

import java.util.Locale;
import java.util.Scanner;

// 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno
// for maior ou igual a 7.0 imprime no console "Aprovado", s
// e a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.println("Insira duas notas: ");
        System.out.print("Primeiro digite a nota 1: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = sc.nextFloat();

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado! :)");
        } else if (media <= 7.0 && media >= 4.0){
            System.out.println("Recuperacao! :|");
        } else {
            System.out.println("Reprovado! :(");
        }

        sc.close();
    }
}
