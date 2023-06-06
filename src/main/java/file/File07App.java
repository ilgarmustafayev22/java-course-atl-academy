package file;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class File07App {
    public static final String RESOURCE = "src/main/java/resource02/";

    public static void main(String[] args) {
        Person rte = new Person(1, "RTE", "T");
        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "people.ser");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            ObjectMapper objectMapper = new ObjectMapper();
            byte[] bytes = objectMapper.writeValueAsBytes(rte);
            oos.write(bytes);
            oos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
