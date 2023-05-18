package GenericTasks;

import java.util.Objects;

public class Result<T> {
    private T data;
    private String name;

    public Result() {
    }

    public Result(T data, String name) {
        this.data = data;
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result<?> result = (Result<?>) o;
        return Objects.equals(data, result.data) && Objects.equals(name, result.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, name);
    }

    @Override
    public String toString() {
        return String.format("Result{data=%s, name='%s'}", data, name);
    }
}
