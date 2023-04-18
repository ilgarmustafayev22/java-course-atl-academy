package lesson04;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        Shape circle1 = new Circle();
        Circle c = (Circle) circle1;
        if (circle1 instanceof Square) {
            Square d = (Square) circle1;
            call(circle1);
        }String  a="desx";
        System.out.println(a instanceof Object);

        call2(rectangle);
        call2(square);
        call2(circle);

    }

    public static void call(Shape shape) {
        shape.print();
    }

    public static void call2(Shape shape) {
        if (shape instanceof Circle) {
            shape.print();
        }
    }
    /*public static void call(Circle circle){
        circle.print();
    }
    public static void call(Square square){
        square.print();
    }
    public static void call(Rectangle rectangle){
        rectangle.print();
    } */

}
