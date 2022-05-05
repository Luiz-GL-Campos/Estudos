package br.com.luiz.calculadora;

import java.util.Scanner;

public class CalculadoraExpressoes {

    public static double calcExp(String exp) {

        if (exp.contains("(")) {
            String exp_aux = exp.substring(0, exp.indexOf("("));
            exp_aux += String.valueOf(calcExp(exp.substring(exp.indexOf("(") + 1, exp.lastIndexOf(")"))));

            if ((exp_aux.contains("+")) || (exp_aux.contains("-")) || (exp_aux.contains("*")) || (exp_aux.contains("/"))) {
                return calcula(exp_aux);
            } else {
                return Double.parseDouble(exp_aux);
            }
        } else {
            return calcula(exp);
        }
    }

    public static double calcula(String result) {

        String y = "";

        char[] operadores = {'+', '-', '/', '*'};
        char operadorSelecionado = 0;

        String x = result;
        y = "";


        for (int i = 0; i < operadores.length; i++) {
            if (x.indexOf(operadores[i]) != -1) {
                operadorSelecionado = operadores[i];
                break;
            }
        }

        String parte1 = x.substring(0, x.indexOf(operadorSelecionado));
        String parte2 = x.substring(x.indexOf(operadorSelecionado) + 1);

        switch (operadorSelecionado) {
            case '+':
                y =
                        String.valueOf(
                        Double.parseDouble(parte1)
                        + Double.parseDouble(parte2));
                break;
            case '-':
                y =
                        String.valueOf(
                        Double.parseDouble(parte1)
                        - Double.parseDouble(parte2));
                break;
            case '/':
                y =
                        String.valueOf(
                        Double.parseDouble(parte1)
                        / Double.parseDouble(parte2));
                break;
            case '*':
                y =
                        String.valueOf(
                        Double.parseDouble(parte1)
                        * Double.parseDouble(parte2));
                break;
            default:
                System.out.println("Operador desconhecido");
                break;
        }


        return Double.parseDouble(y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe uma expressão (OBS: Sem haver espaço entre os elementos): ");
        String exp = scan.next();

        System.out.println("O resultado é: " + calcExp(exp));

        scan.close();
    }
}