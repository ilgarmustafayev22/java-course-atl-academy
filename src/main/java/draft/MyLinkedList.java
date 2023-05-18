package draft;

import java.util.Optional;

public class MyLinkedList<E> {
    private int size = 1;
    private MyNode<E> head;

    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
    }

    public MyNode<E> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void addTail(E data) {
        if (head == null) {
            head = new MyNode<>(data);
            return;
        }
        MyNode<E> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(new MyNode<>(data));
        this.size++;
    }

    public void deleteTail() {
        MyNode<E> curr = head;
        while (curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(null);
        this.size--;
    }

    public void addHead(E data) {
        this.head = new MyNode<>(data, head);
        this.size++;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public Optional<E> findByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is wrong!");
        }
        int counter = 0;
        MyNode<E> curr = head;
        while (counter != index) {
            counter++;
            curr = curr.getNext();
        }
        return Optional.of(curr.getData());
    }


    @Override
    public String toString() {
        String result = "[";
        MyNode<E> curr = head;
        while (curr != null) {
            result = result.concat(curr.toString()).concat("->");
            curr = curr.getNext();
        }
        return result.concat("null]");
    }
}
