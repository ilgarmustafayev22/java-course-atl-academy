package lesson08;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        int number1 = 0;
        int number2 = 0;
        try {
            number1 = Integer.parseInt(word1);
            number2 = Integer.parseInt(word2);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("NumberFormatException");
        }
        System.out.println(number1 / number2);
    }
}
