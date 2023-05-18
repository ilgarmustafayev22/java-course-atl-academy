package lesson13;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (!person1.name.equals(person2.name)) {
            return person1.name.compareTo(person2.name);
        } else if (person1.age != person2.age) {
            return Integer.compare(person1.age, person2.age);
        }

        return Double.compare(person2.salary, person1.salary);
    }
}
