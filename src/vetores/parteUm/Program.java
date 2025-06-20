package vetores.parteUm;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n]; // criando vetor

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int u=0; u<n; u++) {
            sum += vect[u];
        }

        double avg = sum / n;

        System.out.printf("A média dos números é: %.2f%n", avg);
        sc.close();
    }
}
