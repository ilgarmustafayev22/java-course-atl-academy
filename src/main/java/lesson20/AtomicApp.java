package lesson20;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicApp {
    public static volatile int COUNTER = 0;
    public static AtomicInteger atomicInteger;

    public static void main(String[] args) {
        new Thread(() -> COUNTER++).start();
        new Thread(() -> COUNTER++).start();
        new Thread(() -> COUNTER++).start();
        new Thread(() -> COUNTER++).start();
        new Thread(() -> COUNTER++).start();
        System.out.println(COUNTER);
    }
}
