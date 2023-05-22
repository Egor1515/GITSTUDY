package CODEWARS;

public class SecondsConvert {
    public static void main(String[] args) {
        System.out.println(Past(0,1,1));
    }
    public static int Past(int h, int m, int s)
    {
        int hToS = h*60*60;
        int mToS = m*60;

        return (hToS + mToS + s)*1000;
    }
}
