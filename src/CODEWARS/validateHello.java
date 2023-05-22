package CODEWARS;

public class validateHello {
    public static void main(String[] args) {
        System.out.println(validateHello1("hola miser"));
    }

    public static boolean validateHello(String n) {
        String[] greets = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        for (String greet : greets) {
            if (n.toLowerCase().contains(greet)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validateHello1(String n) {
        return n.matches("(?i).*(hello|ciao|salut|hallo|hola|ahoj|czesc).*");
    }
}
