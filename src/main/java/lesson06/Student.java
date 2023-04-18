package lesson06;

public final class Student {
    private final int age;
    private final double[] grades;

    public Student(int age, double[] grades) {
        this.age = age;
        this.grades = grades;
    }
    public int getAge() {
        return age;
    }
    public double[] getGrades() {
        double[] cloneDouble = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            cloneDouble[i]=grades[i];
        }return cloneDouble;
    }

}
