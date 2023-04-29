package lesson05;

public class Human extends Alive implements Runnable,Swimming{
    @Override
    public void run() {
        System.out.println("djdokjm");
    }

    @Override
    public void breath() {
        System.out.println("Human breathing...");
    }

    @Override
    public void swim() {
        System.out.println("edc");
    }
}
