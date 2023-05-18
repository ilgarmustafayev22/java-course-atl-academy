package homework;

import homework.DayOfWeek;
import java.util.Arrays;
import java.util.Objects;

public class Human {
    private Integer iq;
    private Integer year;
    private String name;
    private String surname;
    private Gender type;
    private Family family;
    private DayOfWeek[] schedule;

    public Human(String name, String surname, Integer year, Gender type) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.type=type;
    }
    public Human(String name, String surname, Integer year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(Integer iq, Integer year, String name, String surname, DayOfWeek[] schedule) {
        this.iq = iq;
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }
    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname() + "!");
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

    public Gender getType() {return type;}

    public Family getFamily() {
        return family;
    }

    public DayOfWeek[] getSchedule() {
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
        return String.format("Human{iq=%d, year=%d, name='%s', surname='%s', family=%s, schedule=%s}", iq, year, name, surname, (family!=null)?family:"", Arrays.toString(schedule));
    }
}
