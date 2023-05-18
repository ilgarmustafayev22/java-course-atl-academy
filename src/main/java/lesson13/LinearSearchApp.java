package lesson13;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class LinearSearchApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(searchNum(num, nums));
    }

    public static Optional<Integer> searchNum(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

}
