package CODEWARS;

public class DismoveweldTrolls {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.replaceAll("[aeiouAEIOU]",""));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","?");
        }
}
