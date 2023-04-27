package homework;

public class Fish extends Pet{

    public Fish(String nickname, int age){
        super(Species.FISH, nickname, age);
    }

    @Override
    public void respond() {
        System.out.println("Fish is swimming.");
    }
}
