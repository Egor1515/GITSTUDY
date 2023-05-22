package CODEWARS;

public class MakeNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(0));
    }

    public static int makeNegative(final int x) {
        return x<0?x:-x;
    }
}
