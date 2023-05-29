package lesson19;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson18.P2.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static lesson19.FileApp.RESOURCE;


public class FileApp {
    public static final String RESOURCE = "src/main/java/resource/";
    public static void main(String[] args) {
        String studentsFile = RESOURCE + "people.ser";

        Person rte = new Person(1, "RTE", "T");
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String elvinJson = objectMapper.writeValueAsString(rte);
            System.out.println(elvinJson);
            Files.write(Path.of(studentsFile), elvinJson.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "people.ser")))) {
            byte[] bytes = new ObjectMapper().writeValueAsBytes(rte);
            oos.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
