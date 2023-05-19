package lesson17.P3;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FunctionalProgrammingApp {

    public static void main(String[] args) {
        IntSummaryStatistics statistics = new Random()
                .ints(0, 100)
                .limit(20)
                .summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());

        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer num) {
                return num + " " + num;
            }
        };
        String result = function.apply(4);
        System.out.println(result);

        Function<String, Integer> parser = s -> Integer.parseInt(s);
        Function<String, Integer> parser1 = Integer::parseInt;

        Consumer<List> listConsumer = list -> System.out.println(list);
        Consumer<List> listConsumer1 = System.out::println;

        Supplier<Integer> generateRandom = () -> (int) (Math.random() * 101);

        BiFunction<Integer, Integer, String> concatTimes = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer n, Integer m) {
                return String.valueOf(n * m);
            }
        };
        BiFunction<Integer, Integer, String> concatTimes1 = (n, m) -> String.valueOf(n * m);

        System.out.println(generateRandom.get());

        Predicate<Integer> isEven = num -> num % 2 == 0;

    }

}
