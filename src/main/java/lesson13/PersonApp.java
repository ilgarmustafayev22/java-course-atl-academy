package lesson13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Person[] people = new Person[count];
        for (int i = 0; i < count; i++) {
            people[i] = new Person(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next());
        }
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, new PersonComparator());
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.age, p1.age);
            }
        });
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, Comparator.comparing(p -> p.name));
        System.out.println(Arrays.toString(people));

        for (Person person : people) {
            System.out.printf("%d,%d,%s,%s\n", person.id, person.age, person.salary, person.name);
        }
    }
}
