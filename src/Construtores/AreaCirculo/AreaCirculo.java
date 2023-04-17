package Construtores.AreaCirculo;

public class AreaCirculo {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(9);
        a1.raio = 10;
        System.out.println(a1.areaFormatada());

        AreaCirc a2 = new AreaCirc(5.5);
        System.out.println(a2.areaFormatada());

        System.out.println("======================");
        System.out.println(AreaCirc.pi);
        System.out.println(Math.PI);

        System.out.println("======================");
        System.out.printf("Area: %.2f", AreaCirc.area(3));

    }
}
