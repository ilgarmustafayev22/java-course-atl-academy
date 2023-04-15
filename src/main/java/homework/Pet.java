package homework;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private int age;
    private int tricklevel;
    private String species;
    private String nickname;
    private String[] habits;


    public Pet() {

    }
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }
    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void foul() {
        System.out.println("'I need to cover it up");
    }
    public void respond() {
        System.out.println("Hello, owner. I am -" + nickname + "I miss you!");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && tricklevel == pet.tricklevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(age, tricklevel, species, nickname);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
    @Override
    public String toString() {
        return String.format("Pet{age=%d, tricklevel=%d, species='%s', nickname='%s', habits=%s}", age, tricklevel, species, nickname, Arrays.toString(habits));
    }
}
