package draft;

import java.util.Scanner;

public class ArmstronqApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int rev = temp % 10;
                sum += Math.pow(rev, 4);
                temp /= 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
