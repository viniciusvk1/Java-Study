package Lambda;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(2, 3));

        Calculo multiplicacao = new Multiplicar();
        System.out.println(multiplicacao.executar(2,3));


    }
}
