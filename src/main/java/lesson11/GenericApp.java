package lesson11;

import java.util.UUID;

public class GenericApp {
    public static void main(String[] args) {
        Box<Integer> resultBox = generateRandInt();
        System.out.println(resultBox.getNum());
        System.out.println(resultBox.isEven());
        System.out.println(resultBox);

        Box<Double> resultBox1 = generateRandDouble();
        System.out.println(resultBox1.getNum());
        System.out.println(resultBox1.isEven());
        System.out.println(resultBox1);

        Box<String> resultBox2 = generateRandString();
        System.out.println(resultBox2.getNum());
        System.out.println(resultBox2.isEven());
        System.out.println(resultBox2);
    }

    public static Box<Integer> generateRandInt() {
        int num = (int) (Math.random() * (100));
        boolean isEven = num % 2 == 0;
        return new Box<>(num, isEven);
    }

    public static Box<Double> generateRandDouble() {
        Double num = (Math.random() * (100));
        boolean isEven = num % 2 == 0;
        return new Box<>(num, isEven);
    }

    public static Box<String> generateRandString() {
        return new Box<>(UUID.randomUUID().toString(), true);
    }
}
