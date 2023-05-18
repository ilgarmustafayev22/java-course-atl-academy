package algorithms;

import java.util.Arrays;

public class BubbleSortApp {

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 5, 3, 8, 90, 17};
        bubbleSort(nums);
    }

    public static void bubbleSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
