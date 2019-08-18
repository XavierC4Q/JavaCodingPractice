package problems;

import java.util.Arrays;

public class Partlist {

    public static String[][] partlist(String[] arr) {
        String[][] solution = new String[arr.length - 1][];
        for (int i = 0; i < arr.length - 1; i++) {
            String[] rang = Arrays.copyOfRange(arr, 0, i + 1);
            String[] rest = Arrays.copyOfRange(arr, i + 1, arr.length);
            String[] row = {String.join(" ", rang), String.join(" ", rest)};
            solution[i] = row;
        }
        return solution;
    }
}
