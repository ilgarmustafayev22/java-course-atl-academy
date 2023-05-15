package lesson17;

import java.util.LinkedList;

public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("15");
        list.add(null);
        System.out.println(list);

        list.addFirst("Go");
        System.out.println(list);

        list.addLast("End");
        System.out.println(list);

        String concat = list.element().concat(list.set(2, null));
        System.out.println(concat);

    }
}
