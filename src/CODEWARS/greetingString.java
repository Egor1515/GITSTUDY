package CODEWARS;

public class greetingString {
    public static void main(String[] args) {
        System.out.println(greet("Egor"));
    }

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
}
