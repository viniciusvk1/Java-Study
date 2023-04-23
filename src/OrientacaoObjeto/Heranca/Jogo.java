package OrientacaoObjeto.Heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        Heroi heroi = new Heroi();

        monstro.x = 10;
        monstro.y = 10;

        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println(heroi.vida);
        System.out.println(monstro.vida);

    }
}
