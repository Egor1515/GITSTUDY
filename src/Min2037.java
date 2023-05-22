import java.util.Arrays;

public class Min2037 {
    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int count = 0;

        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(students[i] - seats[i]);
        }
        return count;
    }
}