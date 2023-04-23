package OrientacaoObjeto.Exercicios.DesafioGPT3;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camiseta", 29.99, "Camiseta preta com logo");
        Livro livro1 = new Livro("A Arte da Guerra", 19.99, "Livro sobre estrategias militares", "Sun Tzu");
        Eletronico eletronico1 = new Eletronico("Smartphone", 999.99, "Telefone inteligente", "Apple", "iPhone 13");

        System.out.println("Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Descrição: " + produto1.getDescricao());

        System.out.println("\nLivro 1:");
        System.out.println("Nome: " + livro1.getNome());
        System.out.println("Preço: " + livro1.getPreco());
        System.out.println("Descrição: " + livro1.getDescricao());
        System.out.println("Autor: " + livro1.getAutor());

        System.out.println("\nEletrônico 1:");
        System.out.println("Nome: " + eletronico1.getNome());
        System.out.println("Preço: " + eletronico1.getPreco());
        System.out.println("Descrição: " + eletronico1.getDescricao());
        System.out.println("Marca: " + eletronico1.getMarca());
        System.out.println("Modelo: "+ eletronico1.getModelo());

    }
}
