public class LongestPrefixCommon {
    public static void main(String[] args) {
        String[] arr = {"hee", "heer", "hi"};
        System.out.println(longestCommonPrefix(arr));

    }
    public static String longestCommonPrefix(String[] text) {
        String prefix = text[0];
        for (int i = 1; i < text.length && !prefix.equals(""); i++) {
            while (!prefix.equals("") && !text[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
//Approach
//        Let's start with the prefix being equal
//        to a deep copy of the first word in the string
//        (because we're going to be modifying it).
//
//        Now we don't need to compare the first word to itself,
//        so we'll move on to the following words.
//        You'll note I've added a condition to the for loop to check to see if the prefix is not empty,
//        this is a termination condition.todo MAIN POINT HERE
//        The crux of the issue is that if we know that there is not a common prefix
//        why should we continue to iterate?todo| MAIN POINT HERE
//
//        With our prefix still set to the first word,
//        the next line asks, "Is the first word a prefix of the next word?"
//        Most of the time it won't be, but the prefix will be a part of the first word.
//        So we need to trim it down, letter by letter until we find a prefix that fits.
//        startsWith() is a method provided natively in Java.
//        This is great! Part of our job has been done for us!
//
//        We can really leverage this boolean method to just ask the question we want to know, "Is our prefix also the prefix of the current word?"
//        If yes, we don't do anything and move on.
//        If no, we slice another letter off the end of our prefix string and check again.
//        We keep this up until we've found a prefix that works or the prefix string is empty,
//        meaning there's no common prefix and the termination conditions trigger, ending the loop before going through every word in the array.
//
//        A really important note is that you don't need to check every letter of every word!
//        If there is no common string between the first two words, then there's no common string,
//        period. If you find a prefix that is a single letter after comparing two words,
//        the prefix won't magically be able to become bigger when comparing the rest of the array.
//        The idea is to do the work quickly and get out quickly, work smarter not harder.
//
//        Hope this helps!