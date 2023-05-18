package lesson11;

public class Generic01App {
    public static void main(String[] args) {
        Result<Integer> result1 = validateAndGet(null);
        System.out.println(result1);

        Result<Float> floatResult = validateAndGet(34F);
        System.out.println(floatResult);

        Result<String> aNull = validateAndGet("null");
        System.out.println(aNull);

        Response<String, Integer> input = get("null", 20);
        System.out.println(input);
    }

    public static <T> Result<T> validateAndGet(T t) {
        if (t == null) {
            return new Result<>();
        }
        return new Result<>(t.getClass().getName(), t);
    }

    public static <T, U> Response<T, U> get(T t, U u) {
        return new Response<>(t, u);
    }
}
