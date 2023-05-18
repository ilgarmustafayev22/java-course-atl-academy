package lesson11;

import java.util.Objects;

public final class Box <T>{
    private T num;
    private final boolean isEven;

    public Box(T num, boolean isEven) {
        this.num = num;
        this.isEven = isEven;
    }

    public T getNum() {
        return num;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return isEven == box.isEven && Objects.equals(num, box.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, isEven);
    }

    @Override
    public String toString() {
        return String.format("Box{num=%s, isEven=%s}", num, isEven);
    }
}
