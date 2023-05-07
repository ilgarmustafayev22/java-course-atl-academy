package lesson12;

public final class Student implements Comparable<Student> {
    public final int id;
    public final double grade;
    public final String name;

    public Student(int id, double grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, grade=%s, name='%s'}", id, grade, name);
    }
}
