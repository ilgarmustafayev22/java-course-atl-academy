package lesson19;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    public static final long serialVersionUID = 49;
    public  long id;
    public  String name;
    public  String surname;

    public Person() {

    }

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s'}", id, name);
    }

}

