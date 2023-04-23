package OrientacaoObjeto.Exercicios.DesafioGPT2;

public class TesteLivro {
    public static void main(String[] args) {

        Livro livro1 = new Livro("The Alchemist", "Paulo Coelho ", "Teste", 2020,true);
        System.out.println(livro1);

        livro1.emprestar();
        System.out.println(livro1);

        livro1.devolver();
        System.out.println(livro1);

    }
}
