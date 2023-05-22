package CODEWARS;

public class TotalAmountOfPoints {
    public static void main(String[] args) {
        String[] arr = {"1:2", "3:2", "4:2", "4:2"};
        System.out.println(points(arr));
    }

    public static int points(String[] scores) {
        int result = 0;
        for (String s : scores) {
            char x = s.charAt(0),
                    y = s.charAt(2);
            result += x > y ? 3 : x == y ? 1 : 0;
        }
        return result;
    }
}
