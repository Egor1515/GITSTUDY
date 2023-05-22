import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int prev = 0, result = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < prev) {
                result -= current;
            }
            result += current;
        }
        return result;
    }
}
