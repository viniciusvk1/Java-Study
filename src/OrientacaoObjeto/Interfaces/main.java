package OrientacaoObjeto.Interfaces;

public class main {
    public static void main(String[] args) {

        CalculadoraBasica calc = new CalculadoraBasica();

        double resultado = calc.somar(2.5, 3.0);
        System.out.println("2.5 + 3.0 = " + resultado);

        resultado = calc.subtrair(4.0, 1.5);
        System.out.println("4.0 - 1.5 = " + resultado);

        resultado = calc.multiplicar(2.0, 5.0);
        System.out.println("2.0 * 5.0 = " + resultado);

        resultado = calc.dividir(10.0, 2.0);
        System.out.println("10.0 / 2.0 = " + resultado);

    }
}
