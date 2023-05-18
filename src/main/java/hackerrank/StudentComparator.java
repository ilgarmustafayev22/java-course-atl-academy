package hackerrank;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.grade != s2.grade) {
            return Double.compare(s2.grade, s1.grade);
        } else if (s1.name != s2.name) {
            return s1.name.compareTo(s2.name);
        }
        return Integer.compare(s1.id, s2.id);
    }
}
