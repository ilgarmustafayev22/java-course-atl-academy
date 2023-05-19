package lesson17.P4;

import java.util.ArrayList;
import java.util.List;

public class Stream01App {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Baku");
        list
        .forEach(System.out::println);
    }
}
