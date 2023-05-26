package lesson18.P2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayApp {
    public static final String RESOURCE = "src/main/java/resource/";

    public static void main(String[] args) {
        List<Integer> randomNums = new Random()
                .ints(10, 0, 100)
                .boxed()
                .collect(Collectors.toList());

        try {
            BufferedOutputStream bos =
                    new BufferedOutputStream(new FileOutputStream(ArrayApp.RESOURCE + "nums.ser"));
            bos.write(String.valueOf(randomNums).getBytes(StandardCharsets.UTF_8));
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedInputStream bis =
                    new BufferedInputStream(new FileInputStream(ArrayApp.RESOURCE + "nums.ser"));
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
