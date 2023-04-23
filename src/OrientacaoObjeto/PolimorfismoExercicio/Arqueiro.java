package OrientacaoObjeto.PolimorfismoExercicio;

public class Arqueiro extends Personagem{

    @Override
    public void atacar() {
        System.out.println("O Arqueiro ataca usando seu arco!");
    }

    @Override
    public String toString() {
        return "O Arqueiro ataca usando seu arco!";
    }
}
