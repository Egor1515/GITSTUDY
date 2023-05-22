public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {

        String[] arr = {"++X","++X","X++"};
        System.out.println(finalValue(arr));
    }

    public static int finalValue(String[] operations) {
        int result = 0;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case ("X++"):
                    result++;
                    break;
                case ("++X"):
                    result++;
                    break;
                case ("X--"):
                    result--;
                    break;
                case ("--X"):
                    result--;
                    break;
            }
        }
        return result;
    }
}
