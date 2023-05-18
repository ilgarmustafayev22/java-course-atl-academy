package lesson10;

import java.time.LocalDate;

public class TaskApp {
    public static void main(String[] args) {
        method(12);
    }
    private static <T> void method(T input) {
        if (input == null) {
            throw new InvalidInputException("Invalid Input !!!");
        }
    }

   // private static void method(Integer input) {
   //     if (input == null) {
   //         throw new InvalidInputException("Invalid Input !!!");
   //     }
   // }
//
   // private static void method(String input) {
   //     if (input == null) {
   //         throw new InvalidInputException("Invalid Input !!!");
   //     }
//
   // }
//
   // private static void method(LocalDate input) {
   //     if (input == null) {
   //         throw new InvalidInputException("Invalid Input !!!");
   //     }
   // }
}