package remember;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.next();
            try {
                int num = Integer.parseInt(word);
                System.out.println(num * 5);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Your input incorrect!\n" +
                        "Please entered new input:");
            }

        }
    }
}
