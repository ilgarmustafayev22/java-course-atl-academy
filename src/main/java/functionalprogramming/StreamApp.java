package functionalprogramming;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class StreamApp {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Function<List<Integer>, IntSummaryStatistics> function = new Function<>() {
            @Override
            public IntSummaryStatistics apply(List<Integer> nums) {
                long count = nums.size();
                long sum = nums.get(0);
                int max = nums.get(0);
                int min = nums.get(0);
                for (int i = 1; i < nums.size(); i++) {
                    Integer num = nums.get(i);
                    if (max < num) {
                        max = num;
                    }
                    if (min > num) {
                        min = num;
                    }
                    sum += num;
                }
                return new IntSummaryStatistics(count, min, max, sum);
            }
        };

        IntSummaryStatistics stat = function.apply(list);
        System.out.println(stat);

        IntSummaryStatistics stats = CollectionUtill.COLLECCTION_STATS_FUNC.apply(Arrays.asList(1, 2, -1, 3, 4, 6));
        System.out.println(stats);
    }

}
