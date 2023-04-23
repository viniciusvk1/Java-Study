package OrientacaoObjeto.PolimorfismoExercicio;

public class Mago extends Personagem{

    @Override
    public void atacar() {
        System.out.println("O mago ataca usando seu cajado!");
    }

    @Override
    public String toString() {
        return "O mago ataca usando seu cajado!";
    }
}
