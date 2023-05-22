package CODEWARS;

public class AbbreviateATwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName("egor bondar"));
    }

    public static String abbrevName(String name) {
        String[] na = name.split(" ");
        return na[0].toUpperCase().charAt(0)+"."+na[1].toUpperCase().charAt(0);
    }
}
