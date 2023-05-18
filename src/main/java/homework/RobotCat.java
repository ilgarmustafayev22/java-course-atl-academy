package homework;

public class RobotCat extends Pet implements Foul {
    public RobotCat(String nickname, Integer age) {
        super(Species.ROBOTCAT, nickname, age);
    }
    @Override
    public void respond() {
        System.out.println("Hello, meeoooooow...");
    }

    @Override
    public void foul() {
        System.out.println("Meows incessantly");
    }
}
