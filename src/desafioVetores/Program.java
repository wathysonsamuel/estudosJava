package desafioVetores;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassesPessoas[] vect = new ClassesPessoas[10];

        System.out.print("Quantos quartos serão alugados: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.print("Quarto #" + i + " -> ");

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            ClassesPessoas classesPessoas = new ClassesPessoas(name, email);

            vect[roomNumber] = new ClassesPessoas(name, email);
        }

        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
