package lesson16.P3;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.UUID;

public class OrderApp {
    private static final Queue<Order<String>> queue = new LinkedList<>();

    public static void main(String[] args) {
        makeOrder();
        System.out.println(queue);
        makeOrder();
        System.out.println(queue);
        makeOrder();
        System.out.println(queue);
        processOrder();
        System.out.println(queue);
    }

    public static String makeOrder() {
        final String orderId = UUID.randomUUID().toString();
        queue.add(new Order<>(orderId));
        return orderId;
    }

    public static Optional<String> processOrder() {
        final Order<String> order = queue.peek();
        if (order == null) {
            return Optional.empty();
        }
        queue.poll();
        return Optional.of(order.getId());
    }

}
