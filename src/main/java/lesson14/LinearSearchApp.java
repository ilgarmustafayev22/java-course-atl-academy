package lesson14;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class LinearSearchApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        Optional<Integer> result=findNum(num,nums);
        result.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println(Arrays.toString(nums));

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
