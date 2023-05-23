package lesson16.P3;

import lesson16.P3.Order;

public class OrderApp {

    public static void main(String[] args) {
        Order<Integer> order = new Order<Integer>(5);
        order.makeOrder(6);
        System.out.println(order);

    }

}
