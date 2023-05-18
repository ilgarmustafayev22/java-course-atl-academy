package lesson11;

import java.util.Arrays;

public class ArrayyApp {
    public static void main(String[] args) {
        int[] nums = {0, -1, 4, 12, 20};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
