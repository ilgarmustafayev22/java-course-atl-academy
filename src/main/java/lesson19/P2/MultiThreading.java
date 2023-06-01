package lesson19.P2;

public class MultiThreading extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(new MultiThreading().getClass().getName());
        }
    }
}
