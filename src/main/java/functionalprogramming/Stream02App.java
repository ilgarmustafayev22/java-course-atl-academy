package functionalprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream02App {

    public static void main(String[] args) {
       final String line = "GARABAGH";
        char[] chars = line.toCharArray();
        System.out.println(chars);

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c,count+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : chars) {
            map2.merge(c, 1, Integer::sum);
        }
        System.out.println(map2);

        HashMap<Character, Integer> map3 = new HashMap<>();
        Map<Integer, Long> collect = line
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }

}
