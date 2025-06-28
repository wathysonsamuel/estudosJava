package exeListas.exeListas4;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++) {
            System.out.println("Funcionario #" + i);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            int id;
            while (true) {
                System.out.print("Id: (Três dígitos)");
                id = sc.nextInt();
                sc.nextLine();

                final int idEscolhido = id;
                boolean idOcupado = list.stream().anyMatch(h -> h.getId() == idEscolhido);

                if (id < 0 || id > 999) {
                    System.out.print("Digite números entre 0 e 9");
                } else if (idOcupado) {
                    System.out.print("Id já escolhido");
                } else {
                    break;
                }
            }

            list.add(new Funcionario(nome, id, salario));
        }

        System.out.println("Funcionários cadastrados: ");
        list.stream().sorted(Comparator.comparing(Funcionario::getId)).forEach(h -> System.out.printf("%d: %s%n", h.getId(), h));

        sc.close();
    }
}
