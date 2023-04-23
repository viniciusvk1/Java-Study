package Lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo teste = (x, y) -> {
            return x + y;
        };

        System.out.println(teste.executar(2,3));


    }
}
