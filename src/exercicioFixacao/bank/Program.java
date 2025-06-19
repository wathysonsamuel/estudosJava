package exercicioFixacao.bank;

import exercicioFixacao.entities.Method;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("***** Bem vindo ao Banco *****");

        System.out.print("Qual número da conta (8 Dígitos): ");
        int conta = sc.nextInt();
        sc.nextLine(); // Limpar buffer

        System.out.print("Qual seu nome completo: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial (s/n): ");
        char opcao = sc.next().charAt(0);

        Method contaCliente;
        if (opcao == 's' || opcao == 'S') {
            System.out.print("Quanto deseja depositar: ");
            double valorInicial = sc.nextDouble();
            contaCliente = new Method(conta, nomeTitular, valorInicial);
        } else {
            contaCliente = new Method(conta, nomeTitular);
        }

        // Operações bancárias
        System.out.println("\nDados da conta:");
        System.out.println(contaCliente); // Usa o toString()

        System.out.print("\nQuanto deseja depositar: ");
        double deposito = sc.nextDouble();
        contaCliente.depositar(deposito);
        System.out.println("Saldo após depósito: " + contaCliente.getSaldo());

        System.out.print("\nQuanto deseja sacar: ");
        double saque = sc.nextDouble();
        contaCliente.sacar(saque);
        System.out.println("Saldo após saque: " + contaCliente.getSaldo());

        sc.close();
    }
}