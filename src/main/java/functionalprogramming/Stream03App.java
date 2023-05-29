package functionalprogramming;

import lesson17.P3.DataNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

public class Stream03App {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(foo(list, 5));
    }

    public static <E> E foo(Collection<E> collection, E data) {
        return collection.stream()
                .filter(element -> element.equals(data))
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException("Data not found payload " + data));
    }

}
