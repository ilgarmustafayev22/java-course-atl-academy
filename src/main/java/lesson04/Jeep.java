package lesson04;

public class Jeep extends Car {
    @Override
    public void turn(){
        System.out.println(Jeep.class.getName());
    }
}
