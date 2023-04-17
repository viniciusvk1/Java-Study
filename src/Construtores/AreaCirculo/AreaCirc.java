package Construtores.AreaCirculo;

public class AreaCirc {

    double raio;
    static final double pi = 3.1415;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return pi * Math.pow(raio, 2);
    }

    String areaFormatada() {
        return String.format("A area do circulo e: %.2f", area());
    }

    static double area(double raio) {
        return pi * Math.pow(raio, 2);
    }

}