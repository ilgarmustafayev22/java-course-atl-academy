package file;

import java.io.*;

public class File01App {
    public static final String RESOURCE = "src/main/java/resource02/";

    public static void main(String[] args) {
        try {
            File aTxt = new File(RESOURCE + "a.txt");
            FileWriter fw = new FileWriter(aTxt);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Salam\n");
            bw.write("Salam2");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File aTxt = new File(RESOURCE + "a.txt");
            FileReader fr = new FileReader(aTxt);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(line);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
