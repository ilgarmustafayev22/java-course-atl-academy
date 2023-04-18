package lesson06;

import java.time.DayOfWeek;

public class SeasonApp {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.FALL.name());
        System.out.println(SeasonEnum.WINTER.ordinal());
        System.out.println(SeasonEnum.SPRING.getAverageTemp());

    }
}
