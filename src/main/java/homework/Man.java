package homework;

public class Man extends Human implements RepairCar{
    public Man(String name, String surname, Integer age) {
        super(name, surname, age, Gender.MALE);
    }
    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname() + "!");
    }

    @Override
    public void repairCar() {
        System.out.println("The man is repairing the car.");
    }
}
