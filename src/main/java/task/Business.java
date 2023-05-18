package task;

import java.util.concurrent.ThreadLocalRandom;

public class Business {

    private static int budget = ThreadLocalRandom.current().nextInt(5000, 10000);
    ;
    private static int numberOfWorkers = 0;
    private static int monthlyIncome = ThreadLocalRandom.current().nextInt(1000, 5000);


    public static void hire() {
        numberOfWorkers++;
    }

    public static void fire() {
        numberOfWorkers--;
    }

    public static void PayTaxes() {
        budget -= ThreadLocalRandom.current().nextInt(1000, 2000);
    }

}
