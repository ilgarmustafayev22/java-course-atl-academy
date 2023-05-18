package algorithms;

import java.util.Arrays;

public class SelectionSortApp {

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 2, 4};
        selectionSort(nums);

    }

    public static void selectionSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
