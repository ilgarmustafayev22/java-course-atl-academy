package lesson19;

public class MyThreadApp {

    public static void main(String[] args) {
        new MyThread("1").run();
        new MyThread("2").run();
        new MyThread("3").run();

    }

}
