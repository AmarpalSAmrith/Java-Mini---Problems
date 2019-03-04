package AmarpalAmrith.JaveMiniProblems;

import java.util.Random;
import java.util.Scanner;

public class YourGuessIsAsGoodAsMineP2 {

    public static void main(String[] args) {
        int loNo = 0, hiNo = 100;
        Utilities.msgPrompt("Hi, please think of a number, and i will try and guess it!");
        Scanner scanner = new Scanner(System.in);

        boolean closer = false;
        while (!closer) {
            int rn = randBetween(loNo,hiNo);
            System.out.println("Is your number greater than " + rn + ". Tell me, is it 'too big', 'too small' or 'correct'");
            String proximity = scanner.nextLine();
            if (proximity.equals("too big")) {
                hiNo = rn;
            } else if (proximity.equals("too small")) {
                loNo = rn;
            } else if (proximity.equals("correct")) {
                System.out.println("wooo! i guessed your number is " + rn);
                closer = true;
            }
        }
    }
    private static int randBetween(int lo,int hi) {
        Random randNo = new Random();
        int rn = randNo.nextInt(hi - lo) +lo;
        return rn;
    }
}
