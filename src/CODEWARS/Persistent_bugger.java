package CODEWARS;

public class Persistent_bugger {
    public static void main(String[] args) {
        System.out.println(persistence(195));
    }

    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            int product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            count++;
            n = product;
        }
        return count;
    }
}
