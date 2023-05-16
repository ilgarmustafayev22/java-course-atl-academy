package lesson18;

public class Order<T> {
    private T id;

    public Order(T id) {
        this.id = new Order<T>(id);
    }

    public T getId() {
        return id;
    }
    public Order<T> makeOrder(T id){
        Order<T> temp =new Order<>(id);
        return temp ;
    }
    public T processOrder(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("Order{id=%s}", id);
    }
}
