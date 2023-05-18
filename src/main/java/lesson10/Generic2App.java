package lesson10;

import java.util.Optional;

public class Generic2App {
    public static void main(String[] args) {
        System.out.println(checkMethod("123"));
    }

    public static Optional<String> checkMethod(String word) {
        return word == null || word.isEmpty() ? Optional.empty() : Optional.of(word);
    }
}
