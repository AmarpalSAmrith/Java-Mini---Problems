package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class Utilities {

    public static int condNo(int lowerVal){

        Scanner scanner = new Scanner(System.in);

        if (!(scanner.hasNextInt())) {
            System.out.println("Please enter a valid number and try again!");
            System.exit(-1);
        }

        int noInput = scanner.nextInt();
        if (noInput < lowerVal) {
            System.out.println("Please enter a number greater than 1 and try again!");
            System.exit(-1);
        }

        return noInput;
    }

}
