package lesson17.P2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class StreamApp {

    public static void main(String[] args) {
        Function<List<Integer>, IntSummaryStatistics> function = new Function<List<Integer>, IntSummaryStatistics>() {
            @Override
            public IntSummaryStatistics apply(List<Integer> nums) {
                long count = nums.size();
                int max = nums.get(0);
                int min = nums.get(0);
                long sum = nums.get(0);
                for (int i = 1; i < count; i++) {
                    if (max < nums.get(i)) {
                        max = nums.get(i);
                    }
                    if (min > nums.get(i)) {
                        min = nums.get(i);
                    }
                    sum += nums.get(i);
                }
                return new IntSummaryStatistics(count, max, min, sum);
            }
        };

        Function<List<Integer>, IntSummaryStatistics> function2 = nums -> {
            long count = nums.size();
            int max = nums.get(0);
            int min = nums.get(0);
            long sum = nums.get(0);
            for (int i = 1; i < count; i++) {
                if (max < nums.get(i)) {
                    max = nums.get(i);
                }
                if (min > nums.get(i)) {
                    min = nums.get(i);
                }
                sum += nums.get(i);
            }
            return new IntSummaryStatistics(count,min,max,sum);

        };

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        IntSummaryStatistics statistics = function2.apply(list);
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getSum());

    }

}
