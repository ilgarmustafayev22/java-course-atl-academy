package lesson18;

import java.util.Queue;

public class OrderApp {

    public static void main(String[] args) {
        Order<Integer> order = new Order<Integer>(5);
        order.makeOrder(6);
        System.out.println(order);

    }

}
