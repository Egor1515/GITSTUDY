import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArithmeticTriplet {

    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5,6,7,8,9};
        int diff = 3;
        System.out.println(arithmeticTriplet(arr1,diff));
    }

    public static int arithmeticTriplet(int[] arr, int diff) {
        int result = 0;
        Set<Integer> list = new HashSet<>();

        for (int i : arr) {
            if (list.contains(i - diff) && list.contains(i - diff * 2)) result++;
            list.add(i);
        }
        return result;


    }
}
