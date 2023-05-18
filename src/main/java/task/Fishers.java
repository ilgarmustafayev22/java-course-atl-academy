package task;

public class Fishers extends ProfitMoney{
    private int money;
    private int salary;
    private String name;
    private Specialty specialty;
    public Fishers( int salary, String name) {
        money = 0;
        this.salary = salary;
        this.name = name;
    }
    @Override
    public int work(int hours) {
        int income=specialty.i*hours;
        money+=income;
        return income;
    }
}
