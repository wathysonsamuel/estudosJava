package exeListas.exe2.entidade;

public class Employee {
    private Integer id;
    private String nome;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String nome, Double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void increaseSalary(double porcentage) {
        salary += salary * porcentage / 100;
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salary);
    }
}
