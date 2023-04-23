package OrientacaoObjeto.Exercicios.DesafioGPT2;

public class Livro {

    String titulo;
    String autor;
    String editora;
    int anoPublicacao;
    boolean diponivel;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, boolean diponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.diponivel = diponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDiponivel() {
        return diponivel;
    }

    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }

    public boolean emprestar() {
        return diponivel = false;
    }

    public boolean devolver() {
        return diponivel = true;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "titulo: " + titulo + '\'' +
                ", autor: " + autor + '\'' +
                ", editora: " + editora + '\'' +
                ", anoPublicacao: " + anoPublicacao +
                ", diponivel: " + diponivel;
    }
}
