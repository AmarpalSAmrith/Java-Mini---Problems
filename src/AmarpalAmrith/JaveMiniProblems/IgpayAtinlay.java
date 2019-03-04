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
            if (!vowelCheck(parts[i].charAt(0)) && !vowelCheck(parts[i].charAt(1))) {
                //if the first 2 are consonants
                translated.append(parts[i].substring(2) + parts[i].substring(0,2) + "ay ");
            } else if (vowelCheck(parts[i].charAt(0))){
                translated.append(parts[i] + "way ");
            } else {
                translated.append(parts[i].substring(1) + parts[i].charAt(0) + "ay " );
            }

        }
        System.out.println(translated);
    }
    private static boolean vowelCheck(char letter) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(letter) != -1;
    }
}

