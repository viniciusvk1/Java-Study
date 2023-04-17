package Construtores.Exercicios.DesafioModulo;

import java.util.Locale;
import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Adicionando a Pessoa

        Pessoa pessoa = new Pessoa();
        System.out.println("Bem vindo ao jantar!");
        System.out.print("Primeiramente nos diga o seu nome: ");
        pessoa.nome = sc.nextLine();
        System.out.print("Agora nos diga o seu peso: ");
        pessoa.peso = sc.nextDouble();

        // Adicionando as Comidas

        System.out.println("==================================================");
        System.out.println("O que voce deseja comer? ");
        Comida comida1 = new Comida();
        System.out.print("Digite o nome da comida: "); // Adicionando o arroz
        sc.nextLine();
        comida1.nomeComida = sc.nextLine();
        System.out.printf("Quanto o alimento %s ira adicionar ao peso da pessoa que comer? ", comida1.nomeComida);
        comida1.pesoComida = sc.nextDouble(); // adicionando peso do arroz (valor a ser recebido = 0.300(gramas))

        System.out.println("==================================================");

        Comida comida2 = new Comida();
        System.out.print("Digite o nome da comida: "); // Adicionando o feijao
        sc.nextLine();
        comida2.nomeComida = sc.nextLine();
        System.out.printf("Quanto o alimento %s ira adicionar ao peso da pessoa que comer? ", comida2.nomeComida);
        comida2.pesoComida = sc.nextDouble(); // adicionando peso do arroz (valor a ser recebido = 0.250(gramas))
        System.out.println("==================================================");

        // Adicionando peso da comida  ao peso da pessoa

        pessoa.comer(comida1.pesoComida);
        pessoa.comer(comida2.pesoComida);

        System.out.printf(pessoa.pesoFormatado(pessoa.nome, pessoa.peso));

        sc.close();
    }

}
