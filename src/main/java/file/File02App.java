package file;

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class File02App {
    public static final String RESOURCE = "src/main/java/resource02/";

    public static void main(String[] args) {
        List<Integer> nums = new Random().ints(10, 0, 20)
                .boxed()
                .collect(Collectors.toList());

        try {
            File file = new File(RESOURCE + "b.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Integer num : nums) {
                bw.write(String.valueOf(num));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = new File(RESOURCE + "b.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            List<Integer> list = br.lines()
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .filter(num -> num % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println(list);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
