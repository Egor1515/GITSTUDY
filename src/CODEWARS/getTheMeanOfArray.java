package CODEWARS;

public class getTheMeanOfArray {
    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{1,2,3,4}));
    }

    public static int getAverage(int[] marks) {
        int result = 0;
        for (int mark : marks) {
            result += mark;
        }
        return result / marks.length;
    }
}
