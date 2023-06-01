package file;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class File04App {


    public static final String RESOURCE = "src/main/java/resource02/";

    public static void main(String[] args) {
        List<Integer> list = new Random()
                .ints(10, 0, 20)
                .boxed()
                .collect(Collectors.toList());

        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "d.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[10];
            for (int i = 0; i < list.size(); i++) {
                bytes[i] = list.get(i).byteValue();
            }
            bos.write(bytes);
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "d.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
