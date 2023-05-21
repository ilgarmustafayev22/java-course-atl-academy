package lesson16.P2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        System.out.println(list);

        list.poll();
        System.out.println(list);

        String peek = list.peek();
        System.out.println(peek);
        System.out.println(list);

        System.out.println(list.element());
        System.out.println(list);

        list.offer("ll");
        System.out.println(list);

        list.remove("s");
        System.out.println(list);

        boolean remove = list.remove(1);
        System.out.println(remove);
    }

}
