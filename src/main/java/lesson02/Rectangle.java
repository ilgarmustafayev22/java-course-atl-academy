package lesson02;

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
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public void setA(double a){
        this.a=a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
