package lesson01;

public class Square {

    public double side;
    public String name;

    public Square(){

    }

    public  Square(double side, String name){
        this.side=side;
        this.name=name;
    }
    public double perimeter(){
        return  this.side*4;
    }
    public double area(){
        return side*this.side;
    }

    public static void main(String[] args) {
        int a=5;
        int b;
        System.out.println(a);
        //System.out.println(b);
        Square square1 = new Square();
        System.out.println(square1.perimeter());
        System.out.println(square1.area());

        Square square=new Square(4,"Elvin");
        System.out.println(square.name);
        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}
