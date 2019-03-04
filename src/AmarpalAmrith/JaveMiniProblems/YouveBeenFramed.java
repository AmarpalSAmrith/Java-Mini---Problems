package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class YouveBeenFramed {
    public static void main(String[] args) {
        Utilities.msgPrompt("Hi, Welcome to You've Been Framed. Please enter a phrase");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxWordLength = wordLength(input);
        String frame = symbolBuilder("*",maxWordLength + 4);
        System.out.println(frame);
        String [] splitPhrase = input.split(" ");

        for (int i = 0; i < splitPhrase.length; i++) {
            System.out.println("* "+ splitPhrase[i] + symbolBuilder(" ",
                    (maxWordLength - splitPhrase[i].length()) + 1) + "*");
        }
        System.out.println(frame);
    }

    private static int wordLength(String text) {
        String[] parts = text.split(" ");
        int maxLength = 0;
        for (int i = 0; i < parts.length; i++) {
            if (maxLength < parts[i].length()) {
                maxLength = parts[i].length();
            }
        }
        return maxLength;
    }

    private static String symbolBuilder(String symbolString, int maxLength) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= maxLength; i++) {

            stringBuilder.append(symbolString);
        }
        return stringBuilder.toString();
    }

}
