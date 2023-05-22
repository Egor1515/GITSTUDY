import java.util.*;
import java.util.stream.IntStream;

public class PRACTICE {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int first = 5;
        System.out.println((xorEncode(arr)));
    }

    public static int xorEncode(int[][] n) {
        int sum = 0;
        int len = n.length;
        for (int i = 0; i < n.length; i++) {
            sum += n[i][i];
            sum += n[n.length - i - 1][i];
        }
        if(n.length%2!=0){
            sum-=n[len/2][len/2];
        }
        return sum;
    }
}
