package lesson03;

import java.util.Objects;

public class Student {
    private int age;
    private  int grade;

    public Student(int age, int grade) {
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student{age=%d, grade=%d}", age, grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, grade);
    }
}
