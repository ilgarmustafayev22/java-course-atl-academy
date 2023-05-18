package lesson10;

public final class Box<T> {
    private final T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public boolean isEmpty(){
        return data==null;
  }


}
