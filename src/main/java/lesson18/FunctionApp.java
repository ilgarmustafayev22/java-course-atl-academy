package lesson18;

import java.util.Collection;

import java.util.function.Consumer;

public class FunctionApp {

    public static void main(String[] args) {
        Person person = new Person(99, "Ziya");
        Consumer<Collection<Person>> consumer = new Consumer<Collection<Person>>() {
            @Override
            public void accept(Collection<Person> people) {
                System.out.println(people);
            }
        };
    }
}
