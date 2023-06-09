package lesson17.P2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Stream01App {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Ramin");
        list.add("Kamil");

        list
                .stream()
                .forEach(System.out::println);
        list
                .stream()
                .forEach(s -> System.out.println(s.length()));
        list
                .stream()
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);
        list
                .stream()
                .filter(s -> s.length() >= 3)
                .forEach(s -> System.out.println(s));
        int sum = list
                .stream()
                .filter(s -> s.length() >= 3)
                .mapToInt(s -> s.length())
                .sum();
        System.out.println(sum);
    }

}
