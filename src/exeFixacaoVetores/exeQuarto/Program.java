package exeFixacaoVetores.exeQuarto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai passar: ");
        int n = sc.nextInt();

        int vet[] = new int[n];

        for (int i=0; i<n; i++) {
            System.out.printf("%da número:%n", i + 1);
            vet[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            if (vet[i] < 0) {
                System.out.print(vet[i]);
            }
        }
















        sc.close();
    }
}
