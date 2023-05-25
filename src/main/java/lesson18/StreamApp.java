package lesson18;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {

        Map<Integer, Long> filteredNums = new Random()
                .ints(25, 0, 100)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(filteredNums);

        IntSummaryStatistics statistics = filteredNums
                .keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(statistics);

        Long countOfMax = filteredNums.get(statistics.getMax());
        Long countOfMin = filteredNums.get(statistics.getMin());
        System.out.println(countOfMin);
        System.out.println(countOfMax);

    }

}
