package exeListas.exe1;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Jóse");

        nomes.add(3, "Samuel");

        System.out.println(nomes.get(1));

        nomes.add(4, "Ana");

        nomes.contains("Ana");





        
    }
}
