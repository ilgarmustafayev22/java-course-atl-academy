package draft;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class LinearySearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(nums));
        findNum(num, nums).ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        Optional<Integer> num1 = findNum(num, nums);

        num1.ifPresent(integer -> System.out.println(integer));

        num1.ifPresent(System.out::println);

        System.out.println(findNum(num, nums));
    }

    public static Optional<Integer> findNum(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
