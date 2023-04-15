package lesson03;

import lesson03.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("square..");
    }
}
