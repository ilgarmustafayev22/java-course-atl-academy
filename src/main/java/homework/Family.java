package homework;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private int familyCounter;
    private Pet pet;
    private Human father;
    private Human mother;
    private Human[] children;

    public Family(Pet pet, Human father, Human mother) {
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        familyCounter = 2;
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void addChild(Human child) {
        familyCounter++;
        Human[] temp = new Human[familyCounter - 2];
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                temp[i] = children[i];
            }
        }
        temp[temp.length - 1] = child;
        children = temp;
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                if (children[i].equals(child)) {
                    index = i;
                }
            }
        }
        if (index != -1) {
            familyCounter--;
            Human[] temp = new Human[familyCounter - 2];
            int count = 0;
            for (int i = 0; i < children.length; i++) {
                if (i != index) {
                    temp[count] = children[i];
                    count++;
                }
            }
            children = temp;
            return true;
        }
        return false;
    }

    public int getFamilyCounter() {
        return familyCounter;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {

        this.children = children;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(pet, family.pet) && Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pet, father, mother);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{pet=%s, \nfather=%s, \nmother=%s, \nchildren=%s}", pet, father, mother, Arrays.toString(children));
    }

}
