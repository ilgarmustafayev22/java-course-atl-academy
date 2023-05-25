package lesson18.P2;

import java.io.*;

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

        try {
            File bTxt = new File(RESOURCE + "d.txt");
            FileReader fr = new FileReader(bTxt);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(line);
            br.close();
            fr.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

}
