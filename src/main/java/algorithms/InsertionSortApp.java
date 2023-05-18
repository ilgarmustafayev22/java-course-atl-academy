package algorithms;

import java.util.Arrays;

public class InsertionSortApp {

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 8, 1};
        insertionSort(nums);
    }

    public static void insertionSort(int[] nums) {
        int temp, j;
        for (int i = 0; i < nums.length; i++) {
            j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
