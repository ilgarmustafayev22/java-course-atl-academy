package file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File05App {
    public static final String RESOURCE = "src/main/java/resource02/";

    public static void main(String[] args) {
        Student student1 = new Student(29, 99, "Bob");
        Student student2 = new Student(28, 98, "Alisa");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);


        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(RESOURCE + "f.txt")))) {
            oos.writeObject(student1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(RESOURCE + "f.txt")))) {
            Object object = ois.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
