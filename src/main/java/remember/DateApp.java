package remember;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String year = sc.next();
            String month = sc.next();
            String day = sc.next();

            String date = year + "/" + month + "/" + day;
            LocalDate parseDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

            LocalDate now = LocalDate.now();
            if (parseDate.isAfter(now)) {
                throw new InvalidBirthDayException("Invalid data !!!");
            }
            System.out.println(parseDate);
        } catch (InvalidBirthDayException | NumberFormatException | InputMismatchException | DateTimeException e) {
            System.out.println(e.getMessage());
        }
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}
