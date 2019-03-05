package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class IgpayAtinlay {
    public static void main(String[] args) {
        Utilities.msgPrompt("Hi, Welcome to Pig Latin generator! enter a phrase to translate");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        StringBuilder translated = new StringBuilder();
        String translatedString;
        String completedStr = "";

        for (int i = 0; i < parts.length; i++) {
            if (!vowelCheck(parts[i].charAt(0)) && !vowelCheck(parts[i].charAt(1))) {
                //if the first 2 are consonants
                translated.append(parts[i].substring(2)).append(parts[i].substring(0, 2)).append("ay ");
            } else if (vowelCheck(parts[i].charAt(0))) {
                translated.append(parts[i]).append("way ");
            } else {
                translated.append(parts[i].substring(1)).append(parts[i].charAt(0)).append("ay ");
            }
            translatedString = translated.toString();
            if (Character.isUpperCase(parts[i].charAt(0))) {
                completedStr = translatedString.substring(0,1).toUpperCase() + translatedString.substring(1).toLowerCase();
            }
            translated.append(completedStr);
        }
        System.out.println(completedStr);
    }
    private static boolean vowelCheck(char letter) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(letter) != -1;
    }
}

