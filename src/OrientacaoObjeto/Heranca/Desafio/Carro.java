package OrientacaoObjeto.Heranca.Desafio;

public class Carro {

    int velocidade;

    void acelerar() {
        velocidade = velocidade + 5;
    }

    void frear() {
        if (velocidade >= 5) {
            velocidade = velocidade - 5;
        } else {
            velocidade = 0;
        }
    }

    public String toString() {
        return "Velocidade atual e: "
                + velocidade
                + " Km/H";
    }
}