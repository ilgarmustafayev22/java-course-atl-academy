package draft;

import java.util.Scanner;

public class CompareApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(compare(a,b,c));
    }

    private static int compare(int a, int b, int c) {
        int max = 0;
        if (max < a) {
            max = a;
        }
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
