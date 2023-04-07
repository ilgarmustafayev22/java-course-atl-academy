package lesson03;

public class InheritanceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 3);
        rectangle.draw();

        Square square = new Square(3);
        square.draw();

        Triangle triangle = new Triangle();
        triangle.print();

        Circle circle = new Circle();
        System.out.println(circle.getHello());
    }
}
