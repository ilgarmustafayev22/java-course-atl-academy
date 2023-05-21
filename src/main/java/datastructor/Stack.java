package datastructor;

import java.util.Arrays;

public class Stack {
    private int topOfStack;
    private int capacity;
    private int[] stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        topOfStack = -1;
    }

    public void push(int element) {
        if (topOfStack == capacity - 1) {
            System.out.println("Overflow");
        } else {
            topOfStack++;
            stack[topOfStack] = element;
            System.out.println(element);
        }
    }

    public int pop() {
        if (topOfStack < 0) {
            System.out.println("underflow...");
            return 0;
        } else {
            int element = stack[topOfStack];
            topOfStack--;
            return element;
        }
    }

    @Override
    public String toString() {
        return String.format(Arrays.toString(stack));
    }
}
