package aplicacao;

import calculo.calculadoraCientifica;
import calculo.calculadoraSimples;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha qual sera a Calculadora?");
        System.out.println("1- Calculadora simples");
        System.out.println("2- Calculadora cientifica");
        int tipoCalculadora = sc.nextInt();

        if (tipoCalculadora == 1) {
            calculadoraSimples calcSimples = new calculadoraSimples();
            System.out.println("Escolha o qual sera o tipo da operação: 1- Soma 2- Subtração 3- Multiplicação 4- Divisão");
            int operacao = sc.nextInt();

            System.out.println("Escolha o primeiro numero da operação");
            double a = sc.nextDouble();
            System.out.println("Escolha o segundo numero da operação");
            double b = sc.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case 1:
                    resultado = calcSimples.soma(a, b);
                    break;
                case 2:
                    resultado = calcSimples.subtrair(a, b);
                    break;
                case 3:
                    resultado = calcSimples.multiplica(a, b);
                    break;
                case 4:
                    resultado = calcSimples.dividir(a, b);
                    break;
                default:
                    System.out.println("Operaço invalida");
            }
            System.out.println("Resultado: " + resultado);

        }else if (tipoCalculadora == 2) {
            calculadoraCientifica calcCientifica = new calculadoraCientifica();

            System.out.println("Escolha o qual sera o tipo da operação:");
            System.out.println(" 1- Soma 2- Subtração 3- Multiplicação 4- Divisão");
            System.out.println("5 - Raiz Quadrada, 6 - Potência, 7 - Seno, 8 - Cosseno");
            int operacao = sc.nextInt();

            double resultado = 0;

            switch (operacao) {
                case 1:
                    System.out.println("Escolha o primeiro numero da operação");
                    double a = sc.nextDouble();
                    System.out.println("Escolha o segundo numero da operação");
                    double b = sc.nextDouble();
                    resultado = calcCientifica.soma(a, b);
                    break;
                case 2:
                    System.out.println("Escolha o primeiro numero da operação");
                    a = sc.nextDouble();
                    System.out.println("Escolha o segundo numero da operação");
                    b = sc.nextDouble();
                    resultado = calcCientifica.subtrair(a, b);
                    break;
                case 3:
                    System.out.println("Escolha o primeiro numero da operação");
                    a = sc.nextDouble();
                    System.out.println("Escolha o segundo numero da operação");
                    b = sc.nextDouble();
                    resultado = calcCientifica.multiplica(a, b);
                    break;
                case 4:
                    System.out.println("Escolha o primeiro numero da operação");
                    a = sc.nextDouble();
                    System.out.println("Escolha o segundo numero da operação");
                    b = sc.nextDouble();
                    resultado = calcCientifica.dividir(a, b);
                    break;
                case 5:
                    System.out.println("Escolha o primeiro numero da operação");
                    a = sc.nextDouble();
                    resultado = calcCientifica.calcularRaizQuadrada(a);
                    break;
                case 6:
                    System.out.println("Escolha a base ");
                    double base = sc.nextDouble();
                    System.out.println("Escolha o exponente");
                    double exponente= sc.nextDouble();
                    resultado = calcCientifica.calcularPotencia(base,exponente);
                    break;
                case 7:
                    System.out.println("Digite o  Ângulo em Graus: ");
                    double graus = sc.nextDouble();
                    resultado = calcCientifica.calcularSeno(graus);
                    break;
                case 8:
                    System.out.println("Escolha o primeiro numero da operação");
                    graus = sc.nextDouble();
                    resultado = calcCientifica.calcularCosseno(graus);
                    break;
                default:
                    System.out.println("Operação invalida");
            }
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Tipo da calculo invalido");
        }
        sc.close();
    }
}