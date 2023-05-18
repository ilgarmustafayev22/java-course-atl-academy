package GenericTasks;

import java.util.UUID;

public class GenericApp {
    public static void main(String[] args) {
        System.out.println(generateRandInt());
        System.out.println(generateRandDouble());
        System.out.println(generateRandString());

        Result<Float> method = method(17F);
        Result<Integer> method1 = method(13);
        Result<String> wsx = method("wsx");
        Result<Boolean> method2 = method(true);
        Result<Object> method3 = method(null);
        System.out.println(method);
        System.out.println(method1);
        System.out.println(wsx);
        System.out.println(method2);
        System.out.println(method3);

        Response<Integer, String> edc = getInput(1, "edc");
        System.out.println(edc);
    }

    public static Box<Integer> generateRandInt() {
        int data = (int) (Math.random() * (100));
        boolean isEven = data % 2 == 0;
        return new Box<>(data, isEven);
    }

    public static Box<Double> generateRandDouble() {
        double data = (Math.random() * (100));
        boolean isEven = data % 2 == 0;
        return new Box<>(data, isEven);
    }

    public static Box<String> generateRandString() {
        return new Box<>(UUID.randomUUID().toString(), true);
    }

    public static <T> Result<T> method(T data) {
        return data == null ? new Result<>() : new Result<>(data, data.getClass().getName());
    }

    public static <T, U> Response<T, U> getInput(T t, U u) {
        return new Response<>(t, u);
    }
}
