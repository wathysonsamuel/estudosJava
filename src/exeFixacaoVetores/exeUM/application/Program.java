package exeFixacaoVetores.exeUM.application;

import vetores.parteDois.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int x = sc.nextInt();

        Product[] vect = new Product[x];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine(); // limpar buffer
            System.out.print("Digite um número: ");
            double price = sc.nextDouble();
            vect[i] = new Product(price);
        }

        double sum = 0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double y;
        for (int i=0; i<vect.length; i++) {
            System.out.printf("Valores: %.2f%n", vect[i].getPrice());
        }

        double avg = sum / x;
        System.out.printf("Média: %.2f%n", avg);
        System.out.printf("Soma: %.2f%n", sum);

        sc.close();
    }

}
