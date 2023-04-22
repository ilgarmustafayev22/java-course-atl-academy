package draft01;

import java.util.Scanner;

public class Array01App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =sc.nextInt();
        int[] nums= new int[count];
        for (int i = 0; i < count; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(checkArray(nums));

    }
    private static boolean checkArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j] && i!=j){
                    return true;
                }
            }
        }return false;
    }
}
