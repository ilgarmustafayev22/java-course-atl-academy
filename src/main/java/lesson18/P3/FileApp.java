package lesson18.P3;

import lesson18.P2.Student;

import java.io.*;

public class FileApp {

    public static final String RESOURCE = "src/main/java/resource/";

    public static void main(String[] args) {
        String studentsFile = RESOURCE + "students.ser";
        Student student = new Student(20, 99, "Bob");

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(studentsFile)))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(studentsFile)))) {
            Object object = ois.readObject();
            if (object instanceof Student) {
                Student student1 = (Student) object;
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }

}
