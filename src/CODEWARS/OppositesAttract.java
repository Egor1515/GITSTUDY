package CODEWARS;

public class OppositesAttract {
    public static void main(String[] args) {
        System.out.println(isLove(255,261));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if(flower1%2==0&& flower2%2!=0){
            return true;
        }
        return flower2 % 2 == 0 && flower1 % 2 != 0;
    }
}
