package exeListas.exe2.programa;

import exeListas.exe2.entidade.Employee;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        // READING DATA:

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, nome, salary));

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This Id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employee: ");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
