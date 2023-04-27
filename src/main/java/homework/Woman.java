package homework;

public class Woman extends Human  implements MakeUp{
    public Woman(String name, String surname, int year) {
        super(name, surname, year, Gender.FEMALE);
    }
    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname() + "!");
    }

    @Override
    public void makeUp() {
        System.out.println("Women make up in a beauty salon");
    }
}
