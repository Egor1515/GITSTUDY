import java.util.Arrays;
import java.util.Comparator;

public class CommonLongestPrefix {
    public static void main(String[] args) {
        String[] s = { "sort", "string", "array" };
        Arrays.sort(s, Comparator.naturalOrder());
        System.out.println(Arrays.toString(s));
    }
    public static String longestPrefix(String[] arr) {
        if (arr.length == 0) return "";
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
