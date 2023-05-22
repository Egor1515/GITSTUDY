public class SumMultiples {
    public static void main(String[] args) {
        System.out.println(sumMultiples(7));
    }

    public static int sumMultiples(int n) {
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = n;
            n--;
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0 || arr[i] % 7 == 0) {
                result += arr[i];
            }
        }
        return result;
    }
}
