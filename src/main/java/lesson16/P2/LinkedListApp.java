package lesson16.P2;

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

        list.push("16");
        System.out.println(list);

        String pop = list.pop();
        System.out.println(pop);
        System.out.println(list);

        String peek = list.peek();
        System.out.println(peek);
        System.out.println(list);

        System.out.println("=========");

        String poll = list.poll();
        System.out.println(poll);
        System.out.println(list);

        list.addFirst("Go");
        System.out.println(list);

        list.addLast("End");
        System.out.println(list);

        String concat = list.element().concat(list.set(2, null));
        System.out.println(concat);

        System.out.println(list);
    }

}
