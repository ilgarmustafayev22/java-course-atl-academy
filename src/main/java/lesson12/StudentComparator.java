package lesson12;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if (st1.grade != st2.grade) {
            return Double.compare(st2.grade, st1.grade);
        } else if (st1.name.equals(st2.name)) {
            return st1.name.compareTo(st2.name);
        }
        return Integer.compare(st1.id, st2.id);
    }
}
