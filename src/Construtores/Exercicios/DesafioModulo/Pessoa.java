package Construtores.Exercicios.DesafioModulo;

public class Pessoa {

    public String nome;
    public double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(double pesoComida) {
        this.peso += pesoComida;
    }

    public String pesoFormatado(String nome, double peso){
        return String.format("(O peso total de %s após a refeição é: %.2f kg apos o jantar!",nome, peso);
    }

}
