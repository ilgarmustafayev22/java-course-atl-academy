package functionalprogramming;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public final class CollectionUtill {
    private CollectionUtill() {
        throw new IllegalStateException("Constructor acces is prohibited!");
    }

    public static final Function<List<Integer>, IntSummaryStatistics> COLLECCTION_STATS_FUNC = list1 -> {
       final IntSummaryStatistics statistics = new IntSummaryStatistics();
        list1.forEach(statistics::accept);
        return statistics;
    };
}
