package lesson05;

public class Lion extends Animal implements Runnable{
    @Override
    public void breath() {
        System.out.println("Xrrr");
    }

    @Override
    public void run() {
        System.out.println("errfew");
    }
}
