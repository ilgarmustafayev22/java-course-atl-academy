package functionalprogramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task02App {

    public static void main(String[] args) {
        Person person1 = new Person(15, "Alisa");
        Person person2 = new Person(20, "Bob");

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        Consumer<Collection<Person>> consumer = new Consumer<>() {
            @Override
            public void accept(Collection<Person> people) {
                people.forEach(System.out::println);
            }
        };
        consumer.accept(people);

        Consumer<Collection<Person>> consumer2 = people1 -> people1.forEach(System.out::println);
        consumer2.accept(people);

        Predicate<Person> checkName = new Predicate<>() {
            @Override
            public boolean test(Person person) {
                return person.getName().length() > 5;
            }
        };
        boolean test1 = checkName.test(person1);
        System.out.println(test1);

        Predicate<Person> checkName2 = person -> person.getName().length() > 5;
        boolean test2 = checkName2.test(person2);
        System.out.println(test2);

        BiPredicate<Person, Person> compareNames = new BiPredicate<>() {
            @Override
            public boolean test(Person person1, Person person2) {
                return person1.getName().length() > person2.getName().length();
            }
        };

        boolean test3 = compareNames.test(person1, person2);
        System.out.println(test3);

        BiPredicate<Person, Person> compareNames2 = (person11, person21) -> person11.getName().length() > person21.getName().length();
        boolean test4 = compareNames2.test(person2, person1);
        System.out.println(test4);
    }

}
