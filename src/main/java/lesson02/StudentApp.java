package lesson02;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student elvin = new Student(24, "Elvin", new String[]{"Math", "Cs"});
        System.out.println(elvin.getAge());
        System.out.println(elvin.getName());
        System.out.println(Arrays.toString(elvin.getCourses()));
        String[] courses = elvin.getCourses();
        courses[0]=null;
        courses=null;
        System.out.println(Arrays.toString(elvin.getCourses()));
    }
}
