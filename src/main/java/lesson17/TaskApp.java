package lesson17;

import java.util.Arrays;

public class TaskApp {

    public static void main(String[] args) {
        int size = 20;
        int[] nums = new int[size];

        for (int i = 1; i < nums.length; i++) nums[i] = (int) (Math.random() * 101);

        int sum = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
            sum += nums[i];
        }
        double average = (double) sum / size;

        System.out.println(Arrays.toString(nums));
        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
        System.out.println("Average of all numbers : " + average);
    }

}
