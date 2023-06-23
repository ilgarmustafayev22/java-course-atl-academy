package algorithms;

public class Eee extends Ccc implements Iii {

    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 5, 3, 5, 5};
        int max = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                count = 1;
            } else if (max == nums[i]) {
                count++;
            }
        }
        System.out.println(max + " " + count);
    }

}
