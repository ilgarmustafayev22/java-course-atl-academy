package lesson11;

import java.util.Objects;

public class Result<T> {
    private String className;
    private T num;

    public Result() {
    }

    public Result(String className, T num) {
        this.className = className;
        this.num = num;
    }

    public String getClassName() {
        return className;
    }

    public T getNum() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result<?> result = (Result<?>) o;
        return Objects.equals(className, result.className) && Objects.equals(num, result.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, num);
    }

    @Override
    public String toString() {
        return String.format("Result{className='%s', num=%s}", className, num);
    }
}
