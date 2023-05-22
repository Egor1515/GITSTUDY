package CODEWARS;

public class divisibleByXAndY {
    public static void main(String[] args) {
        System.out.println(isDivisible(3,3,2));
    }

    public static boolean isDivisible(int n, int x, int y) {
        return n % x == 0 && n % y == 0;
    }
}
