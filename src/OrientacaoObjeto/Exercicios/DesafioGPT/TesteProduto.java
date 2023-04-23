package OrientacaoObjeto.Exercicios.DesafioGPT;

public class TesteProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Caneta",1,10,2.50);
        Produto produto2 = new Produto("Caderno",2,5,15.00);

        System.out.printf("O valor total de %s e de: R$%.2f!",produto1.getNome() ,produto1.calcularValorTotal());
        System.out.printf("\nO valor total de %s e de: R$%.2f!",produto2.getNome(), produto2.calcularValorTotal());

    }
}