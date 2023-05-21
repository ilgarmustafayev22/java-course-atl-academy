package datastructor;

import java.util.Arrays;

public class Queue {
    private int[] arr;
    private int capacity;
    private int first;
    private int last;
    private int currentSize;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        first = 0;
        last = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow...");
        } else {
            last += 1;
            arr[last] = item;
            currentSize += 1;
            System.out.println(arr[last]);
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow...");
        } else {
            System.out.println(arr[first]);
            first += 1;
            currentSize--;
        }
    }

    @Override
    public String toString() {
        return String.format(Arrays.toString(arr));
    }
}
