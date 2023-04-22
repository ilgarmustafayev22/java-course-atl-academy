package draft01;

import java.util.Scanner;

public class Task01App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(method01(num));
    }
    private static int method01(int num){
        return num==0 ? 0 : (num>0 ? 1 : -1);
    }
}
