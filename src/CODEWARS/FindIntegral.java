package CODEWARS;

public class FindIntegral {
    public static void main(String[] args) {
//        System.out.println(integrate(3, 2));
        String s = "123.1";
        System.out.println(Math.round(Double.parseDouble(s)));
    }

    public static String integrate(int coefficient, int exponent) {
        return coefficient / ++exponent + "x^" + exponent;
    }
}
