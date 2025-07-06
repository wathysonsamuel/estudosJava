package herancaUpDownCast.application;

import java.util.Locale;
import herancaUpDownCast.entities.Account;
import herancaUpDownCast.entities.SavingsAccount;
import herancaUpDownCast.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        // atribuindo um objeto da subclasse a um objeto da superclasse, fazendo upcasting, de baixo pra cima
        // podemos atribuir uma conta BusinessAccount em uma Account, pois ela é uma Account com algo a mais
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
        // de subclasse para superclasse

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        // Downcasting só funciona se eu fizer o casting manual, colocando que ela é realmente da conta BusinessAccount
        acc4.loan(100);

        // Fazendo dar errado
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // Vai dar errado, pq a acc3 é uma Account, mas não é um BusinessAcount
        // uma SavingsAccount não vai virar BusinessAccount, pois elas não tem ligação
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3; // fazendo teste pra saber
        }


    }
}
