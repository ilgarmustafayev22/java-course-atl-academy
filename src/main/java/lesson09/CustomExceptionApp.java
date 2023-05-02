package lesson09;

import java.util.Scanner;

public class CustomExceptionApp {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        validateAge(age);
        // System.out.println(age);
        // if(age<0 || age>150){
        //     throw new InvalidAgeException("Invalid age!");
        // }
    }

    /**
     *
     * @param age
     * @throws InvalidAgeException
     */
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age!");
        }
    }
}