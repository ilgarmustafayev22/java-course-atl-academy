package lesson17.P3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionApp {

    public static void main(String[] args) {
        Person person1 = new Person(99, "Ziya");
        Person person2 = new Person(10, "Ali");
        Person person3 = new Person(30, "Alim");

        ArrayList<Person> list = new ArrayList<>();

        Consumer<Collection<Person>> consumer1 = new Consumer<Collection<Person>>() {
            @Override
            public void accept(Collection<Person> people) {
                people.forEach(System.out::println);
            }
        };
        list.add(person1);
        list.add(person2);
        list.add(person3);
        consumer1.accept(list);

        Consumer<Collection<Person>> consumer2 = people -> people.forEach(System.out::println);

        Predicate<Person> checkPerson1 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getName().length() > 5;
            }
        };
        Predicate<Person> checkPerson2 = person -> person.getName().length() > 5;

        boolean test = checkPerson1.test(person1);
        System.out.println(test);

        BiPredicate<Person, Person> checkPeople1 = new BiPredicate<Person, Person>() {
            @Override
            public boolean test(Person p1, Person p2) {
                return p1.getName().length() > p2.getName().length();
            }
        };
        BiPredicate<Person, Person> checkPeople2 = (p1, p2) -> p1.getName().length() > p2.getName().length();

        boolean test1 = checkPeople1.test(person1, person2);
        System.out.println(test1);
    }

}
