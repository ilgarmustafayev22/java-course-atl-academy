package remember;

import java.util.UUID;

public class GenericApp {
    public static void main(String[] args) {
        Box<Integer> method1 = methodInt();
        System.out.println(method1.getData());
        System.out.println(method1.isEven());
        System.out.println(method1);

        Box<Double> doubleBox = methodDouble();
        System.out.println(doubleBox.getData());
        System.out.println(doubleBox.isEven());
        System.out.println(doubleBox);

        Box<String> stringBox = methodString();
        System.out.println(stringBox.getData());
        System.out.println(stringBox.isEven());
        System.out.println(stringBox);
    }

    public static Box<Integer> methodInt() {
        int num = (int) (Math.random() * 100);
        boolean isEven = num % 2 == 0;
        return new Box<Integer>(num, isEven);
    }

    public static Box<Double> methodDouble() {
        double num = (Math.random() * 100);
        boolean isEven = num % 2 == 0;
        return new Box<Double>(num, isEven);
    }

    public static Box<String> methodString() {
        return new Box<String>(UUID.randomUUID().toString(), true);
    }
}
