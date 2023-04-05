package lesson01;

public class Car {

    public static int globalValue = 10;
    public String name;

    public Car(String name){
        this.name=name;
    }

    public void start(){
        System.out.println("Gnn");
    }
    public  static void foo(){
        System.out.println("hello, global");
    }

    public static void main(String[] args) {
        Car bmwf30 = new Car("F30");
        System.out.println(bmwf30.name);
        bmwf30.start();

        Car bmwf10 = new Car("F10");
        System.out.println(bmwf10.name);
        bmwf10.start();

        bmwf10.foo();
        bmwf30.foo();
        Car.foo();
        System.out.println(bmwf10.globalValue);
        System.out.println(bmwf30.globalValue);
        System.out.println(Car.globalValue);
    }
}
