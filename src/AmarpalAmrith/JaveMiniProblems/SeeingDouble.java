package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class SeeingDouble {

    public static void main(String[] args) {
        System.out.println("Hi, and welcome to Seeing Double. we will check if your word is a palindrome (its the same backwards)");
        Utilities.msgPrompt("Please enter a new string to check:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        StringBuilder stringBuild = new StringBuilder();
        for (int i = userInput.length() - 1; i >= 0; i--) {
            stringBuild.append(userInput.charAt(i));
        }
        if (userInput.equals(stringBuild.toString())) {
            System.out.println("This is a palindrome!");
        } else {
            System.out.println("This is not a palindrome!");
        }
    }

}
