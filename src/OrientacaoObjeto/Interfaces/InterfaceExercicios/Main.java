package OrientacaoObjeto.Interfaces.InterfaceExercicios;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância de um retângulo com base = 4 e altura = 5
        FormaGeometrica retangulo = new Retangulo(4, 5);

        // Cria uma instância de um círculo com raio = 3
        FormaGeometrica circulo = new Circulo(3);

        // Calcula e exibe a área e o perímetro do retângulo
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);

        // Calcula e exibe a área e o perímetro do círculo
        area = circulo.calcularArea();
        perimetro = circulo.calcularPerimetro();
        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);
    }
}