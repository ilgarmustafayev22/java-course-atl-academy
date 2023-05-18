package lesson10;

public class GenericApp {
    public static void main(String[] args) {
        Object[] objects={1,"A",true};
        print(objects);
    }
   // public static void print(Object[] objects){
   //     for (int i = 0; i < objects.length; i++) {
   //         System.out.println(objects[i]);
   //     }
   // }
    public static <E> void print(E[] data){
        for (E datum : data) {
            System.out.println(datum);
        }
    }
}
