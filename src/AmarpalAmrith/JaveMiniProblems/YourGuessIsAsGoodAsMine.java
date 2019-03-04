package AmarpalAmrith.JaveMiniProblems;

import java.util.Random;

public class YourGuessIsAsGoodAsMine {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int rn = randNumber.nextInt(100) +1;
        Utilities.msgPrompt("Hi, Welcome to Your guess is as good as mine! Try and guess my random number");
        boolean guessedIt = false;
        while (!guessedIt) {
            int input = Utilities.condNo(1);
            Utilities.validNumber(input);
            if (input < rn) { //Less than the random number
                System.out.println("Too Small!");
                System.out.print("Guess again >");
            } else if (input > rn) { //Greater than the random Number
                System.out.println("Too Big");
                System.out.print("Guess again >");
            } else { //User guesses the number correctly
                System.out.println("You guessed it, my number was " + rn);
                guessedIt = true;
            }
        }
    }
}
