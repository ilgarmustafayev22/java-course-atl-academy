package lesson09;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String day = sc.next();
            String month = sc.next();
            String year = sc.next();
            int day1 = 0;
            int month1 = 0;
            int year1 = 0;
            try {
                day1 = Integer.parseInt(day);
                month1 = Integer.parseInt(month);
                year1 = Integer.parseInt(year);

                LocalDate userBirthDay = LocalDate.of(year1, month1, day1);
                System.out.println(userBirthDay);
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                throw e;
            }
        }
    }
}
