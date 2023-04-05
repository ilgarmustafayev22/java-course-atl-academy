package lesson01;

public class HumanApp {
    public static void mainv1(String[] args) {
        int a       =    5;
        int[] arr   = new int[]{1};
        Human empty = new Human();
        System.out.println(empty);
        Human elvin = new Human(24,185,"Elvin");
        System.out.println(elvin);
        Human murad = new Human(18, 186, "Murad");
         elvin.sleep();
         elvin.wakeUp();
        System.out.println(elvin.die());
         elvin=null;
        System.out.println(elvin);
    }

    public static void main(String[] args) {
        Human elvin = new Human(24,185,"Elvin");
        Human murad = new Human(18, 186, "Murad");
        System.out.println(elvin.usdToAznRate);
        System.out.println(murad.usdToAznRate);
        System.out.println(Human.usdToAznRate);
        //elvin.usdToAznRate=1.8;
        System.out.println(elvin.usdToAznRate);
        System.out.println(murad.usdToAznRate);
    }

}
