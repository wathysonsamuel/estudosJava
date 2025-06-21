package exeFixacaoVetores.exeTres.programas;

import exeFixacaoVetores.exeTres.entidades.Entidade;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        Entidade[] entidades = new Entidade[n];

        for (int i=0; i<n; i++) {
            System.out.printf("%da número:%n", i + 1);
            sc.nextLine();
            int numero = sc.nextInt();
            entidades[i] = new Entidade(numero);
        }

        System.out.print("Números divisíveis por 2");
        for (int i=0; i<n; i++) {
            if (entidades[i].getNumero() % 2 == 0) {
                System.out.println(entidades[i].getNumero());
            }
        }



        sc.close();
    }
}
