package lesson04;

public class Bmw extends Car{
    @Override
    public void turn(){
        System.out.println(Bmw.class.getName());
    }
}
