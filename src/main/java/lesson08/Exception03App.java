package lesson08;

public class Exception03App {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(i);
                System.out.println(1/0);
            } catch (ArithmeticException a) {
                a.printStackTrace();
            }
        }
    }
}
