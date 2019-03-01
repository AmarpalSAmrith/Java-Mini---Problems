package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings!");
        System.out.println("==========");
        System.out.println("Please input your name :)");
        System.out.print(">");
        String input = scanner.next();

        if (input.equals("Alice") || input.equals("Bob")) {
            System.out.print("Greetings " + input + ", How are you?");
        } else
            System.out.println("This Program does not know you.");
    }
}
