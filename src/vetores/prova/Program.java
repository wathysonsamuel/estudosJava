package vetores.prova;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Entities.ImprimirPares();

        System.out.println("Qual tamanho do vetor: ");
        int n = sc.nextInt();

        Entities.operacoesVetores(n);
    }
}
