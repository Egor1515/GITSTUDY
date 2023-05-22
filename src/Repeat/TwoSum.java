package Repeat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(twoSum(arr, 5)));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                result[1] = i;
                result[0] = map.get(target - arr[i]);
            }
            map.put(arr[i], i);
        }
        return result;
    }

}
