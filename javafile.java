// Simple Java Program

import java.util.Scanner;

public class javafile {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // Display a personalized greeting
        System.out.println("Nice to meet you, " + name);

        scanner.close();
    }
}

