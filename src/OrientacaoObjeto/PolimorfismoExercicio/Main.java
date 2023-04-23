package OrientacaoObjeto.PolimorfismoExercicio;

public class Main {
    public static void main(String[] args) {

        Personagem[] personagens = new Personagem[3];
        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();
        Arqueiro arqueiro = new Arqueiro();

        personagens[0] = guerreiro;
        personagens[1] = mago;
        personagens[2] = arqueiro;

        for (Personagem personagem:personagens) {
            personagem.atacar();
        }





    }
}
