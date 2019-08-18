package problems;

public class Accumul {

    public static String accum(String s) {
        String solution = "";
        for (int i = 0; i < s.length(); i++) {
            char upper = Character.toUpperCase(s.charAt(i));
            char lower = Character.toLowerCase(s.charAt(i));
            String entry = "" + upper;
            for (int x = 0; x < i; x++) entry += lower;
            if (i + 1 < s.length()) entry += "-";

            solution += entry;
        }
        return solution;
    }
}
