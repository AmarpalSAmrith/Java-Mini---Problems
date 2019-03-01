package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yo! Wagwan dude!");
        System.out.println("================");
        System.out.println("Please provide a number greater than 1 :)");
        System.out.print(">");

        if (!(scanner.hasNextInt())) {
            System.out.println("Please enter a valid number and try again!");
            System.exit(-1);
        }

        int noInput = scanner.nextInt();
        if (noInput < 1) {
            System.out.println("Please enter a number greater than 1 and try again!");
            System.exit(-1);
        }

        int total = 0;
        for (int i = 1; i <= noInput; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                total += i;
            }

        }

        System.out.println("The total from 1 to " + noInput + " is: " + total);

    }
}
