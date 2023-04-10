package lesson04;

public class CarApp {
    public static void main(String[] args) {
        Car bmw = new Bmw();
        Car jeep = new Jeep();
        Merc merc = new Merc();
        //turnsAll(merc);
        turnsAll(bmw);
        turnsAll(jeep);
        System.out.println(bmw instanceof Car);
        //System.out.println(merc instanceof Car);
        System.out.println(bmw instanceof Car);
    }

    public static void turnsAll(Car car) {
        car.turn();
    }

}
