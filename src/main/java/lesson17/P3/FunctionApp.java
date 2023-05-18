package lesson17.P3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionApp {

    public static void main(String[] args) {
        Person person1 = new Person(99, "Ziya");
        Person person2 = new Person(10, "Ali");

        ArrayList<Person> list = new ArrayList<>();

        Consumer<Collection<Person>> consumer = new Consumer<Collection<Person>>() {
            @Override
            public void accept(Collection<Person> people) {
                System.out.println(people);
            }
        };
        list.add(person1);
        list.add(person2);
        consumer.accept(list);

    }

}
