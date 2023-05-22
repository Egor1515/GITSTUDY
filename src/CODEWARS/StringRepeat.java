package CODEWARS;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeat(6,"I"));
    }
    public static String repeat(int n,String s){
        String res = "";
        for (int i = 0; i <n ; i++) {
            res = res + s;
        }
        return res;
    }
}
