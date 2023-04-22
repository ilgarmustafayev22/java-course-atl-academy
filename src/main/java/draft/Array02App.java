package draft;

import java.util.Scanner;

public class Array02App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(checkArrayIncrement(nums));
    }

    private static boolean checkArrayIncrement(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] || nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return result;
    }
}
