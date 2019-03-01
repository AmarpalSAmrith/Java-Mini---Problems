package AmarpalAmrith.JaveMiniProblems;

public class LeapingforJoy {

    public static void main(String[] args) {


        System.out.println("Hi! Please enter the number of leap years you would like to find out");
        System.out.println("====================================================================");
        System.out.print(">");
        int userInput = Utilities.condNo(1);
        if (userInput == -1) {
            System.out.println("Please enter a valid number and try again!");
            System.exit(-1);}
        int counter = 0;
        for (int i = 2019; counter < userInput; i++) {
            if (i % 4 == 0) {
                if ((i % 100 == 0) && (i % 400 == 0)) {
                    System.out.println(i);
                    counter++;
                } else if (i % 100 != 0) {
                    System.out.println(i);
                    counter++;
                }
            }
        }
    }
}
