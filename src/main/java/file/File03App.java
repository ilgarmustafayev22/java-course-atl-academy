package file;

import java.io.*;

public class File03App {

    public static final String RESOURCE = "src/main/java/resource02/";

    public static void main(String[] args) {
        Student student = new Student(25, 99, "Bob");

        try {
            File file = new File(RESOURCE + "c.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(student));
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(RESOURCE + "c.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
