import java.util.Arrays;

public class ShuffleStringArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString("codeleet", arr));
    }


    public static String restoreString(String s, int[] indices) {

        char[] temp = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
}
