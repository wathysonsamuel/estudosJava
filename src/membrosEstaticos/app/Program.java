package membrosEstaticos.app;

import membrosEstaticos.entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dolarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought: ");
        double manyDollars = sc.nextInt();
        double v = Product.CurrencyConverter(dolarPrice, manyDollars);
        System.out.printf("Amount to be paid in reais: %.2f%n", v);
        sc.close();
    }
}