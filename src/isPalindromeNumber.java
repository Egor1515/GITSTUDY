public class isPalindromeNumber {
    public static boolean isPalindrome(int x) {
        int current = x, rev = 0;

        while (current != 0) {
            int remainder = current % 10;//2
            rev = rev * 10 + remainder;//10 + 2
            current /= 10;//1
        }
        return rev == x;

    }
}
