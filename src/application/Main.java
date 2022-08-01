package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Calculos;
import java.io.IOException;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        @SuppressWarnings("UnusedAssignment")
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        Calculos x, y, resultado;
        x = new Calculos();
        y = new Calculos();
        resultado = new Calculos();
        System.out.println("Bem vindo! \n");
        System.out.println("Calculadora \n");
        System.out.println("Andrey Gheno Piekas \n");
        System.out.println("RA = 21095958-5 \n");
        System.out.println("------------ \n");

        do {
            System.out.println("Operações \n");
            System.out.println("1 - Soma \n");
            System.out.println("2 - Subtração \n");
            System.out.println("3 - Multiplicação \n");
            System.out.println("4 - Divisão \n");
            System.out.println("5 - Quadrado de um numero \n");
            System.out.println("0 - Sair \n");
            System.out.println(" \n");
            System.out.println("Prezados, favor escolher a operação desejada \n");
            System.out.println(" \n");
            escolha = sc.nextInt();
            clearScreen();
            switch (escolha) {
                case 5:
                    System.out.println("Insira o valor: \n");
                    x.num1 = sc.nextDouble();
                    break;
                case 0:
                    System.out.println("Aplicação Finalizada");
                    System.exit(0);

            }

            switch (escolha) {
                case 1:
                    System.out.println("Insira o primeiro valor: \n");
                    x.num1 = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Insira o segundo valor: \n");
                    x.num2 = sc.nextDouble();
                    System.out.println("O resultado de " + x.num1 + " + " + x.num2 + " = " + Calculos.somaCalc(x.num1, x.num2));
                    break;
                case 2:
                    System.out.println("Insira o primeiro valor: \n");
                    x.num1 = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Insira o segundo valor: \n");
                    x.num2 = sc.nextDouble();
                    System.out.println("O resultado de " + x.num1 + " - " + x.num2 + " = " + Calculos.subtracaoCalc(x.num1, x.num2));
                    break;
                case 3:
                    System.out.println("Insira o primeiro valor: \n");
                    x.num1 = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Insira o segundo valor: \n");
                    x.num2 = sc.nextDouble();
                    System.out.println("O resultado de " + x.num1 + " * " + x.num2 + " = " + Calculos.multiplicacaoCalc(x.num1, x.num2));
                    break;
                case 4:
                    System.out.println("Insira o primeiro valor: \n");
                    x.num1 = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Insira o segundo valor: \n");
                    x.num2 = sc.nextDouble();
                    System.out.println("O resultado de " + x.num1 + " / " + x.num2 + " = " + Calculos.divisaoCalc(x.num1, x.num2));
                    break;
                case 5:
                    System.out.println("Insira o primeiro valor: \n");
                    x.num1 = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("O resultado do quadrado de " + x.num1 + " = " + Calculos.quadradoCalc(x.num1));
                    break;
                default:
                    System.out.println("Opção Inválida, selecione uma opção entra 1 e 5: \n");

            }
            System.in.read();
            clearScreen();
        } while (escolha != 0);
        clearScreen();

        sc.close();
    }

}
