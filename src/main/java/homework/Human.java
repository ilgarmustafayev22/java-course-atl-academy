package homework;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private int iq;
    private int year;
    private String name;
    private String surname;
    private Family family;
    private String[][] schedule;


    public Human() {

    }
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(int iq, int year, String name, String surname, String[][] schedule) {
        this.iq = iq;
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIq() {
        return iq;
    }

    public int getYear() {
        return year;
    }

    public Family getFamily() {
        return family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return iq == human.iq && year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(family, human.family) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(iq, year, name, surname, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Human{iq=%d, year=%d, name='%s', surname='%s', family=%s, schedule=%s}", iq, year, name, surname, family, Arrays.toString(schedule));
    }
}
