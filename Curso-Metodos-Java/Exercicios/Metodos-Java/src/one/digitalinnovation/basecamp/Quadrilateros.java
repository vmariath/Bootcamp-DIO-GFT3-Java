package one.digitalinnovation.basecamp;

/**
 * Exercicio para calcular a area dos quadrilateros notaveis, utilizando sobrecarga e retorno
 */

public class Quadrilateros {
    public static double areaQuadrado(double lado) {

        return lado*lado;
    }

    public static double areaRetangulo(double lado1, double lado2){

        return lado1*lado2;
    }

    public static double areaTrapezio(double baseMenor, double baseMaior, double altura){

        return ((baseMaior+baseMenor)*altura)/2;
    }

}
