package lesson18.P2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileApp {
    public static final String RESOURCE = "src/main/java/resource/";

    public static void main(String[] args) {
        List<Integer> list = generateRandom();
        System.out.println(list);

        write(list);

        List<Integer> nums = readAllNums();
        nums.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    private static List<Integer> generateRandom() {
        return new Random().ints(10, 0, 100)
                .boxed()
                .collect(Collectors.toList());
    }

    private static void write(List<Integer> nums) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(RESOURCE + "b.txt", StandardCharsets.US_ASCII, true));
            for (Integer num : nums) {
                bw.write(String.valueOf(num));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> readAllNums() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(RESOURCE + "b.txt"));
            List<Integer> nums = br.lines()
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());
            br.close();
            return nums;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
