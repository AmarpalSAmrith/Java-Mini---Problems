package AmarpalAmrith.JaveMiniProblems;

import java.util.Scanner;

public class YourGuessIsAsGoodAsMineP3 {
    public static void main(String[] args) {
        int loNo = 0, hiNo = 100;
        Utilities.msgPrompt("Hi, please think of a number, and i will try and guess it!");
        Scanner scanner = new Scanner(System.in);
        int guessNo = 0;
        boolean closer = false;
        while (!liarLiarPantsOnFire(loNo,hiNo)){ //&& !closer) {
            int currNo = guessBetween(loNo,hiNo);
            System.out.println("Is your number greater than or smaller than " + currNo + ". Tell me, is it 'too big', 'too small' or 'correct'");
            //System.out.println("Is your number greater than or smaller than " + currNo + ". Tell me, is it 'too big' " + hiNo + ", 'too small' " + loNo + " or 'correct'");
            System.out.print(">");
            String proximity = scanner.nextLine();
            if (proximity.equals("too big")) {
                hiNo = currNo;
                guessNo++;
            } else if (proximity.equals("too small")) {
                loNo = currNo;
                guessNo++;
            } else if (proximity.equals("correct")) {
                System.out.println("wooo! i guessed your number is " + currNo + " in " + guessNo + " guesses");
                //closer = true;
            }
        }
        System.out.println("You changed your number! screw you!!");
    }
    private static int guessBetween(int lo,int hi) {
        return ((hi - lo) / 2) + lo;
    }
    private static boolean liarLiarPantsOnFire(int lo, int hi) {
        return (hi - lo) < 2;
    }
}
