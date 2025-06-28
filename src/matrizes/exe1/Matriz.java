package matrizes.exe1;

import java.util.Scanner;
import java.util.Locale;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Matriz com quantos lados: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int k = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.println("#" + k  + " Número: ");


                matriz[i][j] = sc.nextInt();
                k++;
            }
        }

        System.out.println("Matriz principal");
        for (int i=0; i<n; i++) {
            System.out.println(matriz[i][i] + " ");
        }




        sc.close();
    }
}
