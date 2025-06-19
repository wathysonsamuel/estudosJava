package encapsulamentos;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // criando métodos getters e setters para encapsulamento e código seguro
    public void setName(String name) { this.name = name;}
    public String getName() { return name;}

    // criando métodos getters e setters para encapsulamento e código seguro
    public void setPrice(double price) { this.price = price;}
    public double getPrice() { return price;}

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + "units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
