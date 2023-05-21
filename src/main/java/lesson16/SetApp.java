package lesson16;

import java.util.*;
import java.util.stream.Collectors;

public class SetApp {

    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        System.out.println(nums);

        Spliterator<Integer> spliterator = nums.spliterator();
        System.out.println(spliterator.characteristics());

        Set<Integer> set = new Random().ints(15, 0, 20)
                .limit(15)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(set);

        Spliterator<Integer> spliterator1 = set.spliterator();
        System.out.println(spliterator1.trySplit().characteristics());

    }

}
