package VladTen;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                return true;
            }
            set.add(j);
        }
        return false;
    }
}
