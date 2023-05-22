import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        System.out.println(KidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    public static List<Boolean> KidsWithCandies(int[] arr, int extra) {
        int amount = 0;
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        Arrays.sort(arr);
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            amount = temp[i] + extra;
            if (amount >= arr[arr.length - 1])
                list.add(true);
            else list.add(false);
        }
        return list;
    }
}
