import java.util.Arrays;

public class MaxWordsInSentence {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too hell he he he he", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences[i].length(); j++) {
                String[] temp = sentences[i].split(" ");
                int current = temp.length;
                max = Math.max(max, current);
            }
        }
        return max;
    }
}
