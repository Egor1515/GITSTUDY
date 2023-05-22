public class NegativeNumber {
    public static void main(String[] args) {
        System.out.println(makeNegative(-10));
    }

    public static int makeNegative(int n) {
        var a = Integer.toString(n);
        if (n == 0 || a.startsWith("-")) {
            return n;
        }
        else{
            return n * -1;
        }
    }
}
