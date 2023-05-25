package lesson16.P3;

public class Order<T> {
    private T id;

    public Order(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Order{id=%s}", id);
    }
}
