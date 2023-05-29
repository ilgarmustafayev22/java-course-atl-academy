package functionalprogramming;

public class TaskApp {

    public static void main(String[] args) {
        int[] nums = {-4, 6, 11, 7, 14, 8, 2, 5, 1, 3, 0};

        foo(nums);

    }

    private static void foo(int[] arr) {
        int smallestPositive = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < smallestPositive) {
                smallestPositive = arr[i];
            }
        }

        if (smallestPositive == Integer.MAX_VALUE) {
            System.out.println("No positive number found in the array.");
        } else {
            System.out.println("The smallest positive number in the array is: " + smallestPositive);
        }

    }
}
