package task;

import java.util.concurrent.ThreadLocalRandom;

public class Fishing {
    private static int budget = (int) (Math.random() * 5000 + 5000);

    private static int numberOfWorkers = 0;
    private static int numberOfBoats = ThreadLocalRandom.current().nextInt(5, 10);

    private static int numberOfDamagedBoats = ThreadLocalRandom.current().nextInt(1, 3);


    public static void hire() {
        numberOfWorkers++;
    }

    public static void fire() {
        numberOfWorkers--;
    }

    public static void fixBoat() {
        if (numberOfDamagedBoats != 0) {
            budget -= ThreadLocalRandom.current().nextInt(500, 1000);
            numberOfDamagedBoats--;
            numberOfBoats++;
        }
    }
}
