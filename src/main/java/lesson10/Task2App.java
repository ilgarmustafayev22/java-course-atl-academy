package lesson10;

public class Task2App {
    public static void main(String[] args) {

    }
    private static <T> T method(T input)  {
        if (input == null) {
            throw new InvalidInputException("Invalid Input !!!");
        }else {
            return input;
        }
    }
}
