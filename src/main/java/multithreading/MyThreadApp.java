package multithreading;

public class MyThreadApp {

    public static void main(String[] args) {
        new MyThread().run();
        new MyThread().start();
        int priority = new MyThread().getPriority();
        System.out.println(priority);
    }

}
