package AmarpalAmrith.JaveMiniProblems;

public class PrimeTime {

    public static void main(String[] args) {
        System.out.println("Welcome to Prime Time!");
        Utilities.msgPrompt("Please enter a number to check if it is prime");
        int userInput = Utilities.condNo(1);
        System.out.println("Checking " + userInput + " is prime...");

            if (checkifPrime(userInput)) {
                System.out.println(userInput + " is a prime number!");
                //System.exit(-1);
            } else {
                System.out.println(userInput + " is not a prime number!");
            }
    }

    public static boolean checkifPrime(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}

