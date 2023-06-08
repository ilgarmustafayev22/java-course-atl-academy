package lesson19;

public class ThreadApp {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread());
        System.err.println("ABC1");

        Thread thread1 = new Thread("Ilqar");
        System.out.println(thread1);
        System.out.println(thread1.getPriority());

        Thread thread2 = new Thread("Ilqar2");
        System.out.println(thread2);
        System.out.println(thread2.isAlive());
        System.err.println("ABC");


    }

}
