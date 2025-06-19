package palavraThis;

public class Program {
    private String name;
    private double price;
    private int quantity;  // Quantidade pode ser opcional

    // Construtor COMPLETO (nome + preço + quantidade)
    public Program(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Construtor PARCIAL (nome + preço, quantidade = 0)
    public Program(String name, double price) {
        this(name, price, 0);  // Chama o construtor completo com quantidade padrão
    }

    // Construtor MÍNIMO (apenas nome, preço = 1.0, quantidade = 0)
    public Program(String name) {
        this(name, 1.0, 0);  // Preço e quantidade padrão
    }
}