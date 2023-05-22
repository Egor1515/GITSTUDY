package CODEWARS;

public class reverseTheSTring {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public static String rev(String s){
        StringBuilder rev = new StringBuilder();

        for (int i = s.length()-1; i >=0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
