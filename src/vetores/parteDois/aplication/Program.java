package vetores.parteDois.aplication;

import vetores.parteDois.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos serão: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(price, name);
        }

        double soma = 0;
        for (int i = 0; i< vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double avg = soma / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
