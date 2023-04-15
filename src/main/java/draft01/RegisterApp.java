package draft01;

import java.util.Arrays;
import java.util.Scanner;

public class RegisterApp {
    public static void main(String[] args) {
        System.out.println("What do you want to do ?"
                + "\n1. Register Student"
                + "\n2. Show all Student"
                + "\n3. Find Student"
                + "\n4. Update Student");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("How many students you will ?");
            sc = new Scanner(System.in);
            int count = sc.nextInt();
            Config.students = new Student[count];
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + "Register");
                sc = new Scanner(System.in);
                System.out.println("enter name:");
                String name = sc.nextLine();

                sc = new Scanner(System.in);
                System.out.println("enter surname:");
                String surname = sc.nextLine();

                sc = new Scanner(System.in);
                System.out.println("enter age:");
                int age = sc.nextInt();

                sc = new Scanner(System.in);
                System.out.println("enter className:");
                String className = sc.nextLine();

                Student st = new Student(name, surname, age, className);

                Config.students[i] = st;
            }
            System.out.println("registration completed succesfully");

            for (int i = 0; i < count; i++) {
                Student st = Config.students[i];
                System.out.println(st.getName()+" "+st.getSurname()+" "+st.getAge()+" "+st.getClassName());
            }
        }
    }
}
