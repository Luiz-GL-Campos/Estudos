package br.com.luiz.maiorNumero;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        long x, y;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao comparador de números(maior/menor)");
        System.out.println("Digite o primeiro número:");

        x = scan.nextLong();

        System.out.println("Digite o Segundo número:");

        y = scan.nextLong();

        if(x > y) {
            System.out.println("O número " + x +" é o maior.");

        }else if(y > x){
            System.out.println("O número " + y +" é o maior.");

        }else if(x == y){
            System.out.println("Ambos os numeros " + x +" e "+ y +" são iguais.");

        }else{
            System.out.println("Não foi possivel saber quem é o maior");
        }

        scan.close();
    }
}
