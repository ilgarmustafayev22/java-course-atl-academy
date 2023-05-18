package lesson17.P3;

public class TaskApp {

    public static void main(String[] args) {

        int[] nums = new int[20];

        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        double average = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                max = nums[i];
            }
            sum += nums[i];
            average = (double) sum / nums.length;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
