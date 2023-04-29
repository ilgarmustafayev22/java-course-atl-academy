package lesson05;

public class Fish extends Animal implements Swimming {
    @Override
    public void breath() {
        System.out.println("blo");
    }

    @Override
    public void swim() {
        System.out.println("sxdc");
    }
}
