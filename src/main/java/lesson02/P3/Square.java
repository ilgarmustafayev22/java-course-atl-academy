package lesson02.P3;

public class Square extends Figure{
    private double side;

    public Square(double side) {
        super(side*side,side*4);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
