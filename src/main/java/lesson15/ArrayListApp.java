package lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

        nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        System.out.println(nums);

        System.out.println(nums.size());

        nums.remove(2);
        System.out.println(nums);

        nums.clear();
        System.out.println(nums);

    }
}
