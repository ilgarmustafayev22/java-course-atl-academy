package lesson08;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exception01App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        int[] nums = new int[]{1};
        System.out.println(nums[0]);

        int aNum = Integer.parseInt("a123");
        System.out.println(aNum);
        try {
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        try {
            String s = "Salam";
            System.out.println(s.length());
            s = null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }


        try {
            FileWriter fw = new FileWriter("src/main/java/lesson08/a.txt");
            fw.write("Hello, World!");
            fw.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
            //System.out.println("alma");
        }

    }
}
