package GenericTasks;

import java.util.Objects;

public class Box<T> {
    private T data;
    private boolean isEven;

    public Box(T data, boolean isEven) {
        this.data = data;
        this.isEven = isEven;
    }

    public T getData() {
        return data;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return isEven == box.isEven && Objects.equals(data, box.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, isEven);
    }

    @Override
    public String toString() {
        return String.format("Box{data=%s, isEven=%s}", data, isEven);
    }
}
