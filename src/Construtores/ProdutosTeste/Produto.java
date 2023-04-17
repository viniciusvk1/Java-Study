package Construtores.ProdutosTeste;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double produtoComDesconto() {
        return preco * (1 - desconto);
    }

    String produtoFormatado() {
        double descontoPercentual = desconto * 100;
        return String.format("O valor do produto com desconto de %.0f%% é: R$%.2f%n", descontoPercentual, produtoComDesconto());
    }

}