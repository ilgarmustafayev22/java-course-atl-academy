package lesson06;

public enum SeasonEnum {
    SPRING(25), SUMMER(39), FALL(21), WINTER(0);

    private final int averageTemp;

    SeasonEnum(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }
}
