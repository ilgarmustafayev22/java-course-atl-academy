package homework;

public class HappyFamilyApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Rock",5);
        DomesticCat cat = new DomesticCat("Oscar",4);
        Woman mother = new Woman("Jane", "Corleone", 1902);
        Man father = new Man("Vito", "Corleone", 1900);
        Man child = new Man("Jony","Corleone",1970);
        mother.makeUp();
        father.repairCar();
        dog.foul();
        dog.eat();
        dog.respond();
        cat.eat();
        cat.foul();
        cat.respond();

        Family family = new Family(dog, father,mother);
        family.addChild(child);
        System.out.println(family);
        System.out.println();
        family.deleteChild(child);
        System.out.println(family);
    }
}
