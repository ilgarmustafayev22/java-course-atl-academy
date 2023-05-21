package lesson16.P2;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

    public static void main(String[] args) {
        Deque<String> list = new LinkedList<>();
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        System.out.println(list);

        list.poll();
        System.out.println(list);

        list.pop();
        System.out.println(list);

        list.push("32");
        System.out.println(list);

        String peek = list.peek();
        System.out.println(peek);

        list.addFirst("9");
        System.out.println(list);

        list.addFirst("15");
        System.out.println(list);

        String first = list.getFirst();
        System.out.println(first);

        String last = list.getLast();
        System.out.println(last);
    }

}
