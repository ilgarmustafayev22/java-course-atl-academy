package lesson17.P3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {
        final String word = "GARABAGH";
        char[] chars = word.toCharArray();

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : chars) {
            if (counts.containsKey(c)) {
                Integer count = counts.get(c);
                counts.put(c, count + 1);
            } else {
                counts.put(c, 1);
            }
        }
        System.out.println(counts);

        Map<Character, Integer> counts2 = new HashMap<>();
        for (char c : chars) {
            Integer count = counts2.get(c);
            if (count != null) {
                counts2.put(c, count + 1);
            } else {
                counts2.put(c, 1);
            }
        }
        System.out.println(counts2);

        Map<Character, Integer> counts3 = new HashMap<>();
        for (char c : chars) {
            counts3.merge(c, 1, Integer::sum);
        }
        System.out.println(counts3);

        Map<Integer, Long> counts4 = word
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(counts4);

        Map<Integer, Integer> counts5 = word
                .chars()
                .boxed()
                .collect(Collectors.toMap(k->k,v->1,Integer::sum));
        System.out.println(counts5);

    }

}
