package lesson03;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student samir = new Student(20, 76);
        Student student = new Student(13, 98);
        Student student1 = new Student(13, 98);
        System.out.println(samir.getAge());
        System.out.println(samir.getGrade());
        System.out.println(samir);
        System.out.println(samir.hashCode());
        boolean isEqual=student1.equals(student);
        System.out.println(isEqual);
    }
}
