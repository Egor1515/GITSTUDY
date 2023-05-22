package CODEWARS;

public class ExpandedNumber {

    public static void main(String[] args) {
        System.out.println(expandedForm(1511));
    }

    public static String expandedForm(int num) {
        String numStr = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));

            if (digit != 0) {
                if (result.length() != 0) {
                    result.append(" + ");
                }
                result.append(digit * (int) Math.pow(10, numStr.length() - i - 1));
            }
        }

        return result.toString();

    }
}
