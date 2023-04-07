package lesson02.P2;

public class InheritanceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);
        Square square = new Square(3);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        square.draw();
        rectangle.draw();
    }
}
