package draft;

import java.util.Scanner;

public class FindReverseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(finR(n));
        System.out.println(findPolyndrom(n));

        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            n /= 10;
            System.out.print(rem);
        }
    }

    public static int finR(int value) {
        int reverse = 0;
        while (value > 0) {
            reverse *= 10;
            reverse += value % 10;
            value /= 10;
        }
        return reverse;
    }
    public static boolean findPolyndrom(int value){
        value=finR(value);
        return true;
    }
}
