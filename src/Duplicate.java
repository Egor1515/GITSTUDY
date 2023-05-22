import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println(isDuplicate(new int[]{1,2,3}));
    }

    public static boolean isDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
