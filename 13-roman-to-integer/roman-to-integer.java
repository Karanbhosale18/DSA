import java.util.*;

class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            // Check next character
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));

                // Subtraction case
                if (current < next) {
                    sum += (next - current);
                    i++; // skip next character
                } else {
                    sum += current;
                }
            } else {
                sum += current;
            }
        }

        return sum;
    }

    // Helper method
    public int value(char ch) {
        switch (Character.toUpperCase(ch)) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}