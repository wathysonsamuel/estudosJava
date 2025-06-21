package exeFixacaoVetores.exeDois.application;

import exeFixacaoVetores.exeDois.entities.Pessoa;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaDasAlturas = 0;
        int menoresDe16 = 0;

        for (int i=0; i<n; i++) {
            somaDasAlturas += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16) {
                menoresDe16++;
            }
        }

        double mediaAltura = somaDasAlturas / n;
        double porcentagemMenores16 = (double) menoresDe16 / n * 100;

        System.out.printf("%nAltura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcentagemMenores16);

        for (int i=0; i<n; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }
        sc.close();
    }
}
