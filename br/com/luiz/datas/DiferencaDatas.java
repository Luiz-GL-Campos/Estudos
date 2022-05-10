package br.com.luiz.datas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiferencaDatas {
    public static void main(String[] args) {
        String dt1, dt2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma data no formato: dd/MM/aaaa");
        dt1 = scan.nextLine();

        System.out.println("Insira outra data no formato: dd/MM/aaaa");
        dt2 = scan.nextLine();

        LocalDate data1 = LocalDate.parse(dt1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate data2 = LocalDate.parse(dt2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Period period = Period.between(data1, data2);

        int anos = period.getYears();
        int meses = period.getMonths();
        int dias = period.getDays();

        System.out.println("A diferença entre as duas datas é " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).");

        scan.close();
    }
}
