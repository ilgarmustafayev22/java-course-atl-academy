package remember;

public class Generic01App {
    public static void main(String[] args) {
        Result<String> salam = validateGet("Salam");
        Result<Integer> integerResult = validateGet(12);

        System.out.println(salam);
        System.out.println(integerResult);

        Result<Float> floatResult = validateGet(12F);
        System.out.println(floatResult);

        Result<String> objectResult = validateGet(null);
        System.out.println(objectResult);

        Response<String, Long> input = getInput("edcxsx", 34L);
        System.out.println(input);
    }

    public static <T> Result<T> validateGet(T data) {
        if (data == null) {
            return new Result<>();
        }
        return new Result<>(data, data.getClass().getName());
    }

    public static <T, U> Response<T, U> getInput(T t, U u) {
        return new Response<>(t, u);
    }
}
