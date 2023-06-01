package lesson19.P2;

public class MultiThreadingApp {

    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        new Thread(thread01).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.MIN_PRIORITY);
            }
        }).start();

         new Thread(() -> System.out.println(Thread.getAllStackTraces())).start();
    }

}
