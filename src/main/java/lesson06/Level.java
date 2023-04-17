package lesson06;

public enum Level {
    LOW,
    MEDIUM,
    HIGH;

    public static void main(String[] args) {
        Level level = Level.HIGH;
        Level level1 = Level.MEDIUM;
        Level level2 = Level.LOW;
        System.out.println(level2);
        System.out.println(level1);
        System.out.println(level);
    }
}
