package lesson08;

import java.util.Scanner;

public class Exception02App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int num = 0;
        try {
            num = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        while (num > 0) {
            int rev = num % 10;
            System.out.print(rev);
            num /= 10;
        }
    }
}
