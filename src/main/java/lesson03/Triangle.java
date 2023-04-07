package lesson03;

public class Triangle extends Figure {
    public void print(){
        System.out.println("triangle");
    }

    @Override
    public void draw() {
        System.out.println("triangle...");
    }
}
