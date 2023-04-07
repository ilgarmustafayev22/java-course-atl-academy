package lesson02.P2;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return 4 * a;
    }
    public void draw(){
        System.out.println("Done!");
    }

}
