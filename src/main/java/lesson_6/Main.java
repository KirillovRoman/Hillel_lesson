package lesson_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Entered number: " + number);

            throw new Exception("Exception in try block");
        } catch (Exception e) {
            System.out.println("Catch block");
            throw new RuntimeException("Exception in catch block");
        }
    }
}
