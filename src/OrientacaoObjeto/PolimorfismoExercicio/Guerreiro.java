package OrientacaoObjeto.PolimorfismoExercicio;

public class Guerreiro extends Personagem{

    @Override
    public void atacar() {
        System.out.println("O guerreiro ataca com sua espada!");
    }

    @Override
    public String toString() {
        return "O guerreiro ataca com sua espada!";
    }
}
