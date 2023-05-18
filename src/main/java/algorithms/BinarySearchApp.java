package algorithms;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class BinarySearchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] nums = {2, 7, 9, 11, 20, 25, 27, 50, 51, 60};

        Optional<Integer> num = findNum(x, nums);
        System.out.println(num);
        num.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        num.ifPresent(integer -> System.out.println(integer));
        num.ifPresent(System.out::println);

    }

    public static Optional<Integer> findNum(int x, int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (x > nums[mid]) {
                start = mid + 1;
            } else if (x < nums[mid]) {
                end = mid - 1;
            } else {
                return Optional.of(mid + 1);
            }
        }
        return Optional.of(-(start + 1));
    }
}
