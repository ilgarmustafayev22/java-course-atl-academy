package lesson18.P2;

import java.io.*;
import java.util.Arrays;

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
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try {
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(ArrayApp.RESOURCE + "d.txt"));
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
