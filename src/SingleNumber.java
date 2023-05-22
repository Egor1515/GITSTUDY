public class SingleNumber {
    public static void main(String[] args) {
        int n =0;
        System.out.println(n^=100);
//        System.out.println(singleNumber(new int[]{1,2,1,2,4}));
    }

    public static int singleNumber(int[] arr) {
        int n = 0;

        for (int i : arr) {
            n ^= i;
            System.out.println(n);
        }
        return n;
    }
}
