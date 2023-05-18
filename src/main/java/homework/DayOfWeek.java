package homework;

public enum DayOfWeek {
    SUNDAY("do home work"),
    MONDAY("go to courses; watch a film"),
    TUESDAY("Listening to music"),
    WEDNESDAY("To take a walk"),
    THURSDAY("Go to job interview"),
    FRIDAY("Go to the gym"),
    SATURDAY("To rest");
    private final String task;

    DayOfWeek(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
