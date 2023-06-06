package lesson19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationApp {
    public static final String RESOURCE = "src/main/java/resource/";

    public static void main(String[] args) {
        String studentsFile = RESOURCE + "people.ser";

        Person rte = new Person(1, "RTE", "T");

        try {
            FileOutputStream fos = new FileOutputStream(studentsFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(rte);
            oos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Path path = Paths.get(RESOURCE, "people.ser");
            Files.writeString(path, "Elvin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(studentsFile)));
            Person person = (Person) ois.readObject();
            if (person instanceof Person) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
