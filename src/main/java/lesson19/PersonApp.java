package lesson19;

import lesson18.P2.Student;

import java.util.Arrays;

public class PersonApp {

    public static void main(String[] args) {
        Person rte = new Person(1, "RTE", "T");
        System.out.println(rte.getClass());
        System.out.println(rte.getClass().getSuperclass());
        System.out.println(Arrays.toString(rte.getClass().getAnnotations()));
        System.out.println(rte.getClass().getCanonicalName());
        System.out.println(rte.getClass().getClassLoader());
        System.out.println(rte.getClass().getPackage());
        System.out.println(Arrays.toString(rte.getClass().getDeclaredConstructors()));
        System.out.println(rte.getClass().isPrimitive());
        System.out.println(rte.getClass().cast(new Object()));

    }

}
