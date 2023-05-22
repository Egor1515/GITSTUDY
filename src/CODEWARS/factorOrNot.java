package CODEWARS;

public class factorOrNot {
    public static void main(String[] args) {
        System.out.println(checkForFactor(9,3));
    }
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
