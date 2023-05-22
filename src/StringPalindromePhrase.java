public class StringPalindromePhrase {
    public static void main(String[] args) {
        System.out.println(isPhrasePalindrome1("A man, a plan, a canal: Panama"));
    }

    public static boolean isPhrasePalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }

    public static boolean isPhrasePalindrome1(String s) {
        if (s.isEmpty())
            return true;
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head >= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                tail--;
                head++;
            }
        }
        return true;
    }
}