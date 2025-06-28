package exeListas.exe5;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Estoque> estoques = new ArrayList<>();

        while (true) {
            System.out.println("===Sistema de estoque===");
            System.out.println("1 - Adicionar novo produto");
            System.out.println("2 - Adicionar estoque");
            System.out.println("3 - Remover estoque");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Código do produto: (3 dígitos) ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    boolean existe = estoques.stream().anyMatch(p -> p.getCodigo() == codigo);
                    if (existe) {
                        System.out.println("Código já cadastrado!");
                        break;
                    }

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    estoques.add(new Estoque(codigo,  nome, preco, quantidade));
                    System.out.print("Produto adicionado!");
                    break;

                case 2:

                    System.out.print("Código do produto: ");
                    int codAdd = sc.nextInt();
                    Optional<Estoque> prodAdd = estoques.stream().filter(p -> p.getCodigo() == codAdd).findFirst();
                    if (prodAdd.isPresent()) {
                        System.out.print("Quantidade para adicionar: ");
                        int q = sc.nextInt();
                        prodAdd.get().addEstoque(q);
                        System.out.println("Estoque atualizado!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:

                    System.out.print("Código do produto: ");
                    int codRmv = sc.nextInt();
                    Optional<Estoque> prodRmv = estoques.stream().filter(p -> p.getCodigo() == codRmv).findFirst();
                    if (prodRmv.isPresent()) {
                        System.out.print("Quantidade para adicionar: ");
                        int q = sc.nextInt();
                        prodRmv.get().removeEstoque(q);
                        System.out.println("Estoque atualizado");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;

                case 4:

                    System.out.println("Lista de produtos: ");
                    estoques.forEach(System.out::println);
                    break;

                case 5:

                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção invalida! tente novamente.");
            }
        }
    }
}
