package problems;

public class Printer {
    public static String printerError(String s) {
        int numerator = 0;
        int denominator = s.length();

        int m = (int)'m';

        for (int i = 0; i < denominator; i++) {
            if (s.charAt(i) > m) {
                numerator++;
            }
        }

        return String.format("%d/%d", numerator, denominator);
    }
}
