package lesson18.P2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentApp {
    public static final String RESOURCE = "src/main/java/resource/";
    public static void main(String[] args) {
        Student student = new Student(20, 99, "Bob");

        try {
            File dTxt = new File(RESOURCE + "d.txt");
            FileWriter fw = new FileWriter(dTxt);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(student.toString());
            bw.close();
            fw.close();
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

}
