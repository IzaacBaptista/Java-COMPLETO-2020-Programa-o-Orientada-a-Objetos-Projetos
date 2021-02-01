package Exercicios;

import java.util.Locale;

public class exercicioUm {
    public static void main(String[] args) {
        String productOne = "Computer";
        String productTwo = "Office Desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double priceOne = 2100.0;
        double priceTwo = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n");
        Locale.setDefault(Locale.US);
        System.out.printf( productOne + ", which price is $" + priceOne + "\n");
        System.out.printf( productTwo + ", which price is $" + priceTwo + "\n\n");

        System.out.printf("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n\n");

        System.out.println("Measue with eight decimal places: " + measure + "\n");
        System.out.println("Rouded (three decimal places): " + measure + "\n");
        System.out.printf("Measue with eight decimal places: " + measure + "\n");
    }
}
