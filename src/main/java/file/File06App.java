package file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class File06App {

    public static void main(String[] args) {
        Student student1 = new Student(29, 99, "Bob");

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String studentJSon = objectMapper.writeValueAsString(student1);
            System.out.println(studentJSon);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

}
