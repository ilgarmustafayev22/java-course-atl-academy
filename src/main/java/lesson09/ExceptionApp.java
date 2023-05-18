package lesson09;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            String word = sc.next();
            try {
                num = Integer.parseInt(word);
                System.out.println(num * 5);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Exception!!!, Please try again...");
            }
        }
    }
}
