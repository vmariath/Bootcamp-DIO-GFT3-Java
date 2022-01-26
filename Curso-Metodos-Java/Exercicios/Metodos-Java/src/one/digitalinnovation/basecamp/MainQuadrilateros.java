package one.digitalinnovation.basecamp;

public class MainQuadrilateros {
    public static void main(String[] args) {

        System.out.println("Exercicio Sobrecarga e Retorno");

        double areaQuadrado = Quadrilateros.areaQuadrado(2);
        System.out.println("A area do quadrado é: "+ areaQuadrado);

        double areaRetangulo = Quadrilateros.areaRetangulo(4, 6);
        System.out.println("A area do Retangulo é: "+ areaRetangulo);

        double areaTrapezio = Quadrilateros.areaTrapezio(7, 8, 4);
        System.out.println("A area do Trapezio é: "+ areaTrapezio);

    }
}
