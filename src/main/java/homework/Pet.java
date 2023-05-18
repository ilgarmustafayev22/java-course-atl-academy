package homework;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private Integer age;
    private Species type;
    private String nickname;

    public Pet(Species type, String nickname) {
        this.type = type;
        this.nickname = nickname;
    }
    public Pet(Species type, String nickname, Integer age) {
        this.type = type;
        this.nickname = nickname;
        this.age = age;
    }

    public abstract void respond();

    public void eat() {
        System.out.println("The pet is eating...");
    }

    public Species getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && type == pet.type && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, type, nickname);
    }

    @Override
    public String toString() {
        return String.format("Pet{age=%d, type=%s, nickname='%s'}", age, type, nickname);
    }
}
