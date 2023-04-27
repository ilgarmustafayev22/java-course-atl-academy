package homework;

public class Dog extends Pet implements Foul{
    public Dog(String nickname, int age) {
        super(Species.DOG, nickname, age);
    }
    @Override
    public void respond() {
        System.out.println("The dog is barking.");
    }
    @Override
    public void foul() {
        System.out.println("A dog barks when it sees another dog.");
    }
}
