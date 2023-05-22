public class SingleNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 5, 4, 3, 3, 4};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result ^= i;
        }
        return result;
    }
}
