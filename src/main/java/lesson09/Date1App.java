package lesson09;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date1App {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        date.setTime(0);
        System.out.println(date);

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yy")));

        System.out.println(LocalTime.now().isBefore(LocalTime.ofSecondOfDay(4)));

        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH/mm/ss")));
        LocalTime localTime = LocalTime.now().plusHours(24);
        System.out.println(localTime);

        System.out.println(LocalDateTime.now().toString());

        System.out.println(LocalDate.of(2001, 8, 10));

        LocalDate elvinBirthDate = LocalDate.of(1999, 6, 14);
        LocalDate samirBirthDay = LocalDate.of(1996, 6, 14);
        System.out.println(elvinBirthDate.isBefore(samirBirthDay));

        String day = "01";
        String month = "02";
        String year = "2003";
        String date1 = year + "-" + month + "-" + day;
        LocalDate parsedDate = LocalDate.parse(date1);
        System.out.println(parsedDate);

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

    }
}
