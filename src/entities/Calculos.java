package entities;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Calculos {

    public double num1;
    public double num2;
    public double resultado;

    public static double somaCalc(double num1, double num2) {
        return (num1 + num2);
    }

    public static double subtracaoCalc(double num1, double num2) {
        return (num1 - num2);
    }

    public static double multiplicacaoCalc(double num1, double num2) {
        return (num1 * num2);
    }

    public static double divisaoCalc(double num1, double num2) {
        return (num1 / num2);
    }

    public static double quadradoCalc(double num1) {
        return Math.pow(num1, 2);
    }

}
