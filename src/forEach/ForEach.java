package forEach;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Samuel", "Julia", "Laiane"};

        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect) {
            System.out.println(obj);
        }

    }
}
