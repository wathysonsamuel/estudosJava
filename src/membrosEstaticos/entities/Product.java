package membrosEstaticos.entities;

public class Product {
    public static double CurrencyConverter(double dolarPrice, double manyDollars) {
        double c = dolarPrice * manyDollars;
        c += c * 0.06;
        return c;
    }

}