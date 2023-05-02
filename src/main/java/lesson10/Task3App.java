package lesson10;

import java.util.Comparator;
import java.util.Optional;

public class Task3App {
    public static void main(String[] args) {
        String a = "";
        System.out.println(method(a));
    }
    private static Optional<String> method(String input) {
        if ((input == null) || (input.isEmpty())) {
            return Optional.empty();
        } else {
            return Optional.of(input);
        }
    }
}
