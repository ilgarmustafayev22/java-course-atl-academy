package functionalprogramming;

import java.util.IntSummaryStatistics;
import java.util.Random;

public class Task01App {

    public static void main(String[] args) {
        IntSummaryStatistics statistics = new Random().ints(20, 0, 100)
                .summaryStatistics();
        System.out.println(statistics);
    }

}
