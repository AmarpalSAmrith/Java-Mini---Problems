package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class SummingUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yo! Wagwan dude!");
        System.out.println("================");
        System.out.println("Please provide a number greater than 1 :)");
        System.out.print(">");
        int input = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= input; i++) {
            if ((i % 3 ==0) || (i % 5 == 0)){
                total += i;
            }

        }
        System.out.println("The total from 1 to " + input + " is: " + total);

    }
}
