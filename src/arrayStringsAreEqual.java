public class arrayStringsAreEqual {
    public static void main(String[] args) {
        String[] s = new String[]{"12", "12"};
        String[] s1 = new String[]{"12", "1", "2"};

        System.out.println(arrayStringsAreEqual(s, s1));
    }


    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = String.join("", word1);
        String w2 = String.join("", word2);
        return w1.equals(w2);
    }
}
