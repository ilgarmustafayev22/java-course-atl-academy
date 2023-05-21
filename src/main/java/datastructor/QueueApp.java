package datastructor;

import java.util.PriorityQueue;

public class QueueApp {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        boolean empty = queue.isEmpty();
        System.out.println(empty);

        boolean full = queue.isFull();
        System.out.println(full);
    }
}
