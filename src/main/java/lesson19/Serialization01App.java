package lesson19;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Serialization01App {
    public static final String RESOURCE = "src/main/java/resource/";
    public static final Path path = Paths.get(RESOURCE, "people01.ser");

    public static void main(String[] args) {
        final Person ilqar = new Person(1, "Ilqar", "Mustafayev");

        ObjectMapper objectMapper = new ObjectMapper();
        byte[] bytes = null;
        try {
            bytes = objectMapper.writeValueAsBytes(ilqar);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] readAllBytes = null;
        try {
            readAllBytes = Files.readAllBytes(path);
            System.out.println(Arrays.toString(readAllBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Person person = objectMapper.readValue(readAllBytes,new  TypeReference < >(){});
            System.out.println(Arrays.toString(readAllBytes));
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
