public class SumOfmultiplesOf3and5 {
    public static void main(String[] args) {
        System.out.println(sumOf(10));
    }

    public static int sumOf(int n) {
        int[] temp = new int[n];
        int result = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
            if (temp[i] % 3 == 0 || temp[i] % 5 == 0) {
                result += temp[i];
            }
        }
        return result;
    }
}
