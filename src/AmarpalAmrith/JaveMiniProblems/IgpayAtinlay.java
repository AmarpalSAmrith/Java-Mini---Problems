package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class IgpayAtinlay {
    public static void main(String[] args) {
        Utilities.msgPrompt("Hi, Welcome to Pig Latin generator! enter a phrase to translate");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        StringBuilder translated = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            translated.append(parts[i].substring(1) + parts[i].charAt(0) + "ay ");
        }
        System.out.println(translated);
    }
    private static boolean vowelCheck(String word) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(word);
    }
}

