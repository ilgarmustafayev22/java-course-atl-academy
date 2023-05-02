package lesson10;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        method(12);
    }

    private static void method(Integer input) throws InvalidInputException {
        if (input == null) {
            throw new InvalidInputException("Invalid Input !!!");
        }
    }

    private static void method(String input) throws InvalidInputException {
        if (input == null) {
            throw new InvalidInputException("Invalid Input !!!");
        }

    }

    private static void method(LocalDate input) throws InvalidInputException {
        if (input == null) {
            throw new InvalidInputException("Invalid Input !!!");
        }
    }
}