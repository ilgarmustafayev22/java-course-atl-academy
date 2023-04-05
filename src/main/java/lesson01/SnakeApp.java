package lesson01;

public class SnakeApp {
    public static void main(String[] args) {
        Snake snake = new Snake(5, "snakee");
        System.out.println(snake.voice());
    }
}
