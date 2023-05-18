package lesson15;

import lesson16.InvalidIndexException;

import java.util.NoSuchElementException;
import java.util.Optional;

public class MyLinkedList<E> {
    private MyNode<E> head;
    private  int size = 1;


    public MyLinkedList(E data) {
        this.head = new MyNode<>(data);
    }

    public MyNode<E> getHead() {
        return head;
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
        size++;
        curr.setNext( new MyNode<>(data));

    }
    public Optional<E> findByIndex(int index){
        if (index<0 || index>=size){
            throw new InvalidIndexException(index+"is wrong");
        }
        int counter = 0;
        MyNode<E> curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
            counter++;
            if (index==counter){
                return Optional.of(curr.getData());
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        String result = "[";
        MyNode<E> curr = head;
        while (curr != null) {
            result = result.concat(curr.toString().concat(" -> "));
            curr = curr.getNext();
        }
        return result.concat("null]");
    }
}
