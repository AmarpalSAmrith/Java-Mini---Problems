package AmarpalAmrith.JaveMiniProblems;

public class PrimeTime {

    public static void main(String[] args) {
        System.out.println("Welcome to Prime Time!");
        Utilities.msgPrompt("Please enter a number to check if any number upto it is prime");
        int userInput = Utilities.condNo(1);
        if (userInput == -1) {
            System.out.println("Please enter a valid number and try again!");
            System.exit(-1);}
        System.out.println("Checking every number upto " + userInput);
        for (int i = 2; i < userInput; i++) {
            if (checkifPrime(i)) {
                System.out.println(i + " is a prime number!");
            }
        }
    }

    public static boolean checkifPrime (int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}

