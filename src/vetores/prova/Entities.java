package vetores.prova;

import java.util.Random;

public class Entities {
    public static void ImprimirPares() {
        int[] numero = new int[20];

        for (int i=0; i< numero.length; i++) {
            numero[i] = i + 1;
        }
        System.out.println("Números pares de 1 - 20: ");
        for (int num : numero) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void operacoesVetores(int n) {
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] X = new int[n];
        int[] Y = new int[n];

        Random rand = new Random();

        for (int i=0; i<n; i++) {
            A[i] = rand.nextInt(10) + 1;
            B[i] = rand.nextInt(10) + 1;
            C[i] = rand.nextInt(10) + 1;
            Y[i] = rand.nextInt(10) + 1;
        }

        for (int i=0; i<n; i++) {
            X[i] = A[i] + B[i];
            Y[i] = B[i] * Y[i];
        }

        System.out.println("Vetor A: " + java.util.Arrays.toString(A));
        System.out.println("Vetor B: " + java.util.Arrays.toString(B));
        System.out.println("Vetor C: " + java.util.Arrays.toString(C));
        System.out.println("Vetor Y: " + java.util.Arrays.toString(Y));
        System.out.println("Vetor X: " + java.util.Arrays.toString(X));
    }
}
