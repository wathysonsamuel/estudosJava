package exercicioFixacao.entities;

public class Method {
    private final int conta;
    private String nomeTitular;
    private double saldo;

    // Construtor com depósito inicial
    public Method(int conta, String nomeTitular, double saldoInicial) {
        this.conta = conta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Construtor sem depósito inicial
    public Method(int conta, String nomeTitular) {
        this(conta, nomeTitular, 0.0);
    }

    // Métodos para operações bancárias
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        double taxa = 5.0;
        saldo -= (valor + taxa);
    }

    // Getters e Setters
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para exibir dados da conta
    @Override
    public String toString() {
        return String.format(
                "Conta: %d\nTitular: %s\nSaldo: R$ %.2f",
                conta, nomeTitular, saldo
        );
    }
}