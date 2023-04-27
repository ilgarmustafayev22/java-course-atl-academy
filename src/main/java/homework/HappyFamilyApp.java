package homework;

public class HappyFamilyApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Rock",5);
        DomesticCat cat = new DomesticCat("Oscar",4);
        Human mother = new Human("Jane", "Corleone", 1902);
        Human father = new Human("Vito", "Corleone", 1900);
        Human child = new Human("Jony","Corleone",1970);
        dog.foul();
        dog.eat();
        dog.respond();
        cat.eat();
        cat.foul();
        cat.respond();


        String[][] schedule = fillSchedule();
        Family family = new Family(dog, father,mother);
        family.addChild(child);
        System.out.println(family);
        System.out.println();
        family.deleteChild(child);
        System.out.println(family);

    }
    public static String[][] fillSchedule() {
      String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Listening to music";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "To take a walk";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go to job interview";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Go to the gym";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "To rest";
        return schedule;
    }
}
