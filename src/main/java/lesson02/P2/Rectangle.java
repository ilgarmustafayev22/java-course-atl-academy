package lesson02.P2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
    public  double getArea(){
        return a*b;
    }
    public  double getPerimeter(){
        return (a+b)*2;
    }
    public void draw(){
        System.out.println("Done!");
    }
}
