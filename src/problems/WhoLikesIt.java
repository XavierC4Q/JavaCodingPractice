package problems;

import java.util.ArrayList;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }

        ArrayList<String> people = new ArrayList<>();
        StringBuilder solution = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            people.add(names[i]);
        }

        if (people.size() == 1) {
            solution.append(people.get(0))
                    .append(" likes this");

            return solution.toString();
        }

        if (people.size() == 2) {
            solution.append(people.get(0))
                    .append(" and ")
                    .append(people.get(1))
                    .append(" like this");

            return solution.toString();
        }

        if (people.size() == 3) {
            solution.append(people.get(0))
                    .append(", ")
                    .append(people.get(1))
                    .append(" and ")
                    .append(people.get(2))
                    .append(" like this");

            return solution.toString();
        }

        int others = people.toArray().length - 2;

        solution.append(people.get(0))
                .append(", ")
                .append(people.get(1))
                .append(" and ")
                .append(others)
                .append(" others like this");

        return solution.toString();
    }
}
