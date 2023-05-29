package functionalprogramming;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream04App {

    public static void main(String[] args) {
        List<Integer> list = new Random()
                .ints(20, 0, 15)
                .boxed()
                .collect(Collectors.toList());

        Map<Integer, Long> collect = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        IntSummaryStatistics statistics = collect
                .keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        long max = collect.get(statistics.getMax());
        long min = collect.get(statistics.getMin());
        System.out.println(max);
        System.out.println(min);
    }

}
