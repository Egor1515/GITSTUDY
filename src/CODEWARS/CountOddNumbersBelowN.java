package CODEWARS;

public class CountOddNumbersBelowN {
    public static void main(String[] args) {
        System.out.println(oddCount(15));
    }
    public static int oddCount(int n) {
        int count = 0;

        for (int i = n; i >0 ; i--) {
            if(i%2==0&&i>0){
                count++;
            }
        }
        return count;
    }
}
