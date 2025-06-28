package exeListas.exe3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Entities> list = new ArrayList<>(10);

        System.out.print("Quantos quartos serão alugados?");
        int qtd = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i=0; i<qtd; i++) {

            System.out.print("Qual seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Qual seu email: ");
            String email = sc.nextLine();

            int quarto;
            while (true) {
                System.out.print("Quarto de (0-9): ");
                quarto = sc.nextInt();
                sc.nextLine();

                final int quartoEscolhido = quarto;

                boolean ocupado = list.stream().anyMatch(h -> h.getQuarto() == quartoEscolhido);

                if (quarto < 0 || quarto > 9) {
                    System.out.println("Número inválido. Digite de 0-9");
                } else if (ocupado) {
                    System.out.println("Quarto já ocupado, escolha outro!");
                } else {
                    break;
                }
            }
            list.add(new Entities(nome, email, quarto));
        }

        System.out.println("\nQuartos ocupados: ");
        list.stream().sorted(Comparator.comparing(Entities::getQuarto)).forEach(h -> System.out.printf("%d: %s%n", h.getQuarto(), h));

        sc.close();
    }
}
