package lesson17.P3;

import java.util.Collection;
import java.util.LinkedList;

public class Stream01App {

    public static void main(String[] args) {
        Collection<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println(foo(list, 12));
    }

    public static <E> E foo(Collection<E> collection, E data) {
        return collection.stream()
                .filter(element -> element.equals(data))
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException("Data not found payload" + data));
    }

}
