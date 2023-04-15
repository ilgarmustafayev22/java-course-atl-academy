package lesson02;

public class Student {
    private int age;
    private String name;
    private String[] courses;

    public Student(int age, String name, String[] courses) {
        this.age = age;
        this.name = name;
        this.courses = courses;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String[] getCourses() {
        return courses;
    }
}
