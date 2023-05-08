package lesson13;

public final class Person implements Comparable<Person> {
    public final int id;
    public final int age;
    public final double salary;
    public final String name;

    public Person(int id, int age, double salary, String name) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id, that.id);
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, age=%d, salary=%s, name='%s'}", id, age, salary, name);
    }
}
