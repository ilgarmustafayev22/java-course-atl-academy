package lesson17.P4;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class StreamApp {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       Function<List<Integer>,IntSummaryStatistics> function = new Function<List<Integer>, IntSummaryStatistics>() {
           @Override
           public IntSummaryStatistics apply(List<Integer> integers) {
               for (Integer integer : integers) {
                   System.out.println(integer);
               }
               return null;
           }
       };

    }

}
