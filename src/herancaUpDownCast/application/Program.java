package herancaUpDownCast.application;

import herancaUpDownCast.entities.Account;
import herancaUpDownCast.entities.SavingsAccount;
import herancaUpDownCast.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        // atribuindo um objeto da subclasse a um objeto da superclasse, fazendo upcasting, de baixo pra cima
        // podemos atribuir uma conta BusinessAccount em uma Account, pois ela é uma Account com algo a mais

        Account acc2 = new BusinessAccount("1003, "Bob", 0.0, 200.0);
    }
}
