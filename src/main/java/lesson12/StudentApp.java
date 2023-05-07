package lesson12;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(4, 89, "Ali"),
                new Student(3, 90, "Vali"),
                new Student(2, 91, "Pirveli")
        };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("=========");

        System.out.println(Arrays.toString(students));
        Arrays.sort(students,new StudentComparator());
        System.out.println(Arrays.toString(students));

        System.out.println("=========");

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        System.out.println("=========");

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(Arrays.toString(students));

    }
}
