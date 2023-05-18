package homework;

public class DomesticCat extends Pet implements Foul{
    public DomesticCat(String nickname, Integer age) {
        super(Species.CAT, nickname, age);
    }

    @Override
    public void respond() {
            System.out.println("The cat is meowing.");
    }
    @Override
    public void foul() {
        System.out.println("The cat made a mess.");
    }

}
