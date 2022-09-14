package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEx {
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double cotDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantityDollar = sc.nextDouble();

        double result = CurrencyConverter.calcDollar(cotDollar,quantityDollar);



        System.out.printf("Amount to be paid in reais = %.2f%n", result );

        sc.close();
    }
}
