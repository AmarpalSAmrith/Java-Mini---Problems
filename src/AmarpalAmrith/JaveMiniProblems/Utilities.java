package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class Utilities {

    public static int condNo(int lowerVal){

        Scanner scanner = new Scanner(System.in);

        if (!(scanner.hasNextInt())) {
            return -1;
        }

        int noInput = scanner.nextInt();
        if (noInput < lowerVal) {
            System.out.println("Please enter a number greater than 1 and try again!");
            System.exit(-1);
        }

        return noInput;
    }

    public static void msgPrompt(String msg) {
        System.out.println(msg);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= msg.length(); i++) {

            stringBuilder.append("=");
        }
        System.out.println(stringBuilder);
        System.out.print(">");
    }
}
