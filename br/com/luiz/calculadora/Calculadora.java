package br.com.mirante.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int num1, num2, result;
        char op;
        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextInt();
        op = scan.next().charAt(0);
        num2 = scan.nextInt();
        result = 0;

        if(op == '+'){
            result = num1+num2;
            System.out.println("Resultado: "+ result);

        } else if(op == '-') {
            result = num1-num2;
            System.out.println("Resultado: "+ result);

        } else if(op == '*') {
            result = num1*num2;
            System.out.println("Resultado: "+ result);

        } else if(op == '/') {
            result = num1/num2;
            System.out.println("Resultado: "+ result);

        }else{
            System.out.println("Não é posspivel realizar o cálculo proposto.");
        }
        
        scan.close();
    }
}