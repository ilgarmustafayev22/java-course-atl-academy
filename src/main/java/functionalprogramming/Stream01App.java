package functionalprogramming;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream01App {

    public static void main(String[] args) {
        List<Integer> evenNums = new Random().ints(20, 0, 100)
                .boxed()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNums);

        Set<Integer> set = evenNums.stream()
                .filter(nums -> nums > 10 && nums < 30)
                .collect(Collectors.toSet());
        System.out.println(set);

    }

}
