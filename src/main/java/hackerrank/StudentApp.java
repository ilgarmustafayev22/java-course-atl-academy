package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            students[i]= new Student(sc.nextInt(),sc.nextDouble(),sc.next());
        }
        Arrays.sort(students, (s1, s2) -> {
            if (s1.grade != s2.grade) {
                return Double.compare(s2.grade, s1.grade);
            } else if (s1.name != s2.name) {
                return s1.name.compareTo(s2.name);
            }
            return Integer.compare(s1.id, s2.id);
        });
        System.out.println(Arrays.toString(students));

        for (Student student : students) {
            System.out.printf("%d,%s,%s\n",
                    student.id,
                    student.grade,
                    student.name);
        }
        Arrays.stream(students).forEach(student -> System.out.println(student));
        Arrays.stream(students).forEach(System.out::println);
    }
}
